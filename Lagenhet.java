import java.util.ArrayList;

public class Lagenhet {

    private int nummer;
    private int hyra;
    private int yta;
    private Hus hus;
    private ArrayList<Hyrestagare> hyrestagareLista = new ArrayList<>();

    public ArrayList<Hyrestagare> getHyrestagareLista() {
        return hyrestagareLista;
    }

    public void setHyrestagareLista(ArrayList<Hyrestagare> hyrestagareLista) {
        this.hyrestagareLista = hyrestagareLista;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public int getHyra() {
        return hyra;
    }

    public void setHyra(int hyra) {
        this.hyra = hyra;
    }

    public int getYta() {
        return yta;
    }

    public void setYta(int yta) {
        this.yta = yta;
    }

    public Hus getHus() {
        return hus;
    }

    public void setHus(Hus hus) {
        this.hus = hus;
    }

    public Hyrestagare hittaHyrestagare(String pnr) {

        for(Hyrestagare h : hyrestagareLista) {
            if(h.getPersonNummer().equals(pnr)) {
                return h;
            }
        }
        return null;
    }

    public void laggTillHyrestagare(Hyrestagare person) {
        hyrestagareLista.add(person);
    }

    public String getHusAdress() {
        return hus.getAdress();
    }
}
