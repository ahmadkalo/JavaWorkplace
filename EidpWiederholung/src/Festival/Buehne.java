package Festival;

public class Buehne {

    private String name;
    private double preis;
    private int anzahlTickets;

    public Buehne(double preis) {
        this.preis = preis;

    }

    public void verkaufen(int gewünschteAnzahl) {
        if(gewünschteAnzahl > 0) {
        anzahlTickets += gewünschteAnzahl;
        } else {
            System.out.println("Fehler!");
        }
    }

    @Override
    public String toString() {
        return "Preis: " + preis + ", Anzahl Tickets: " + anzahlTickets;
    }

    public int getAnzahlTickets() {
        return anzahlTickets;
    }

    public static void main(String[] args) {
        Buehne b = new Buehne(50);
        Buehne a = new Buehne(40);

        b.verkaufen(4);
        a.verkaufen(3);

        System.out.println(b);

    }

}
