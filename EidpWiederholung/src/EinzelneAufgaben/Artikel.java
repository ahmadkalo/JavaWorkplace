package EinzelneAufgaben;
public class Artikel {
	
	
    private String bezeichnung;
    private double preis;
    private int bestand;
    private double umsatz;

    public Artikel(String bezeichnung, double preis) {
        this.bezeichnung = bezeichnung;
        this.preis = preis;
        this.bestand = 0;
        this.umsatz = 0.0;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getBestand() {
        return bestand;
    }

    public double getUmsatz() {
        return umsatz;
    }

    public void liefern(int menge) {
        this.bestand += menge;
    }

    public void verkaufen(int menge) {
        if (this.bestand >= menge) {
            this.bestand -= menge;
            this.umsatz += menge * this.preis;
        } else {
            System.out.println("Nicht genügend Artikel im Lagerbestand!");
        }
    }

    public static void main(String[] args) {
        Artikel tisch = new Artikel("Tisch", 120.0);
        Artikel stuhl = new Artikel("Stuhl", 40.0);

        tisch.liefern(10);
        stuhl.liefern(20);

        tisch.verkaufen(6);
        stuhl.verkaufen(11);

        System.out.println("Im Lager vorrätig:");
        System.out.println("Tische: " + tisch.getBestand());
        System.out.println("Stühle: " + stuhl.getBestand());

        System.out.println("Umsatz:");
        System.out.println("Tische: " + tisch.getUmsatz() + " Euro");
        System.out.println("Stühle: " + stuhl.getUmsatz() + " Euro");
    }
}