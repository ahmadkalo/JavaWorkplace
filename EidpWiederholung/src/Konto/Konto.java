package Konto;

public class Konto {

    private static int naechstekontonummer = 1000;
    private static double gebuehr = 0.12;

    private Person kontoinhaber;
    private int kontonummer;
    private double kontostand;
    private double gesamtgebuehren;

    public Konto(Person kontoinhaber) {

        this.kontoinhaber = kontoinhaber;
        this.kontonummer = naechstekontonummer++;
        this.kontostand = 0.0;
    }

    public void einzahlen(double betrag) {
        if (betrag > 0) {

            kontostand += betrag;
            gesamtgebuehren += gebuehr;

        } else {
            System.out.println("Negativer Betrag nicht möglich");
        }
    }

    public void abheben(double betrag) {
        if (betrag > 0) {
            if (kontostand >= betrag) {
                kontostand -= betrag - gebuehr;
                gesamtgebuehren += gebuehr;
            } else {
                System.out.println("Auszahlung nicht möglich");
            }
        } else {
            System.out.println("Negativer Betrag nicht möglich");
        }
    }

    public void ueberweisen(double betrag, Konto neuesKonto) {
        if (betrag > 0) {
            if (kontostand >= betrag) {
                kontostand -= betrag - gebuehr;
                gesamtgebuehren += gebuehr;
                neuesKonto.einzahlen(betrag);
            } else {
                System.out.println("Überweisung nicht möglich");
            }
        } else {
            System.out.println("Negativer Betrag nicht möglich");
        }
    }

    public double getKontostand() {
        return kontostand;
    }

    public int getKontonummer() {
        return kontonummer;
    }

    public Person getInhaber() {
        return kontoinhaber;
    }

    @Override
    public String toString() {

        return "Kontoinhaber: " + kontoinhaber.getName() + ", Kontonummer: " + kontonummer + ", Aktueller Kontostand: "
                + kontostand + "€.";
    }

    public void kontoauszug() {
        System.out.println(toString());
    }

    public static void setGebuehren(double neueGebuehr) {
        gebuehr = neueGebuehr;
    }

    public static double getGebuehr() {
        return gebuehr;
    }

    public double abschlussRechnung() {
        double alteGebuehren = gesamtgebuehren; // Gesamtgebühren vor der Änderung
        gesamtgebuehren = 0.0; // Reset der Gesamtgebühren für die nächste Abschlussrechnung
        return alteGebuehren;
    }

    public static void main(String[] args) {
        Konto konto1 = new Konto(new Person("Ahmed", "Kalo"));
        Konto konto2 = new Konto(new Person("Telman", "Müller"));
        Konto konto3 = new Konto(new Person("Delyar", "Schneider"));

        konto1.einzahlen(50);
        konto1.abheben(1);


        konto2.einzahlen(50);
        konto2.abheben(1);

        //konto2.ueberweisen(15, konto1);

        konto3.einzahlen(50);
        konto3.abheben(4);
        //konto3.ueberweisen(40, konto1);

        double gesamtgebuehren = konto1.abschlussRechnung();
        System.out.println(gesamtgebuehren);

        konto1.kontoauszug();
        konto2.kontoauszug();
        konto3.kontoauszug();


        Konto.setGebuehren(0.20);
        System.out.println("---------------------------------------------------------------");
        konto1.einzahlen(1);
        konto1.kontoauszug();


    }
}