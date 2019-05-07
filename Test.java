public class Test {

    public static void main(String[] args) {
        Hus hus = new Hus();
        hus.setAdress("Storgatan 2");
        hus.setInkopspris(16000000);

        Lagenhet l1 = new Lagenhet();
        Lagenhet l2 = new Lagenhet();

        l1.setNummer(1);
        l1.setHyra(7200);
        l1.setYta(72);
        l2.setNummer(2);
        l2.setHyra(8900);
        l2.setYta(86);

        Hyrestagare h1 = new Hyrestagare();
        Hyrestagare h2 = new Hyrestagare();
        Hyrestagare h3 = new Hyrestagare();
        Hyrestagare h4 = new Hyrestagare();

        h1.setPersonNummer("111");
        h1.setNamn("Rolke af Sturup");
        h2.setPersonNummer("222");
        h2.setNamn("Tove af Sturup");
        h3.setPersonNummer("333");
        h3.setNamn("Sten Stensson");
        h4.setPersonNummer("444");
        h4.setNamn("Agneta Stensson");

        l1.setHus(hus);
        l2.setHus(hus);
        hus.laggTillLagenhet(l1);
        hus.laggTillLagenhet(l2);

        h1.setLagenhet(l1);
        h2.setLagenhet(l1);
        h3.setLagenhet(l2);
        h4.setLagenhet(l2);

        l1.laggTillHyrestagare(h1);
        l1.laggTillHyrestagare(h2);
        l2.laggTillHyrestagare(h3);
        l2.laggTillHyrestagare(h4);

        hus.printHyrestagare(1);
        System.out.println(h1.adress());
    }
}
