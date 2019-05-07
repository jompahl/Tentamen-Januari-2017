public class Hyrestagare {

    private String personNummer;
    private String namn;
    private Lagenhet lagenhet;

    public String getPersonNummer() {
        return personNummer;
    }

    public void setPersonNummer(String personNummer) {
        this.personNummer = personNummer;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public Lagenhet getLagenhet() {
        return lagenhet;
    }

    public void setLagenhet(Lagenhet lagenhet) {
        this.lagenhet = lagenhet;
    }

    public String adress() {
        return lagenhet.getHusAdress();
    }
}
