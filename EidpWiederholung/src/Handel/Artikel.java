package Handel;

public class Artikel {

    static int naechsteNummer = 1000;
    String bezeichnung;
    double preis;
    int artikelnummer;

    public Artikel(String bezeichnung, double preis) {
        this.bezeichnung = bezeichnung;
        this.preis = preis;
        this.artikelnummer = naechsteNummer++;
    }

    public double getPreis() {
        return preis;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    @Override
    public String toString() {
        return "Artikel{" + "bezeichnung= '" + bezeichnung  + ", preis= " + preis + ", artikelnummer= " + artikelnummer + '}';
    }
}
