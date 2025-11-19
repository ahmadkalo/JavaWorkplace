package KontoGeierBank;

public class Konto {

    private String kontonr;
    private String inhaber;
    private double kontostand;
    private int anzahlBuchungen;


    public Konto(String kontonr, String inhaber) {
        this.kontonr = kontonr;
        this.inhaber = inhaber;
        this.kontostand = 0;
        this.anzahlBuchungen = 0;

    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }

     public double einzahlen(double betrag) {
        this.kontostand += betrag;
        this.anzahlBuchungen++;
        return this.kontostand;

     }

    public double abheben(double betrag) {
        this.kontostand -= betrag;
        this.anzahlBuchungen++;
        return this.kontostand;

    }

    public int getAnzahlBuchungen() {
        return anzahlBuchungen;
    }

    @Override
    public String toString() {
        return "Konto von: " + inhaber + ", Kontostand: " + kontostand + ", Kontonummer: " + kontonr;
    }


    public static void main(String[] args) {

        Konto konto1 = new Konto("123456", "Naz");
        konto1.einzahlen(1000);
        konto1.abheben(200);
        System.out.println(konto1);
    }
}
