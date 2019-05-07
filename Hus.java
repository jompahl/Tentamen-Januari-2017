import java.util.ArrayList;

public class Hus {

    private String adress;
    private int inkopspris;
    private ArrayList<Lagenhet> lagenhetsLista = new ArrayList<>();

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getInkopspris() {
        return inkopspris;
    }

    public void setInkopspris(int inkopspris) {
        this.inkopspris = inkopspris;
    }

    public ArrayList<Lagenhet> getLagenhetsLista() {
        return lagenhetsLista;
    }

    public void setLagenhetsLista(ArrayList<Lagenhet> lagenhetsLista) {
        this.lagenhetsLista = lagenhetsLista;
    }

    public void laggTillLagenhet(Lagenhet lagenhet) {
        lagenhetsLista.add(lagenhet);
    }

    public Lagenhet hittaLagenhet(int nr) {

        for(Lagenhet l : lagenhetsLista) {
            if(l.getNummer() == nr) {
                return l;
            }
        }
        return null;
    }

    public void printHyrestagare(int lagNbr) {
        Lagenhet l = hittaLagenhet(lagNbr);

        if(l != null) {
            for(Hyrestagare h : l.getHyrestagareLista()) {
                System.out.println("Personnummer: " + h.getPersonNummer() + " namn: " + h.getNamn());
            }
        }
    }

}
