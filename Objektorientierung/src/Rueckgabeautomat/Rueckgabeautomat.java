package Rueckgabeautomat;

public class Rueckgabeautomat {
    private int[] muenzbestand;

    // Konstruktor, der den Münzbestand des Automaten initialisiert
    public Rueckgabeautomat(int[] muenzbestand) {
        this.muenzbestand = muenzbestand;
    }

    // Methode, um den aktuellen Münzbestand zu ermitteln
    public int[] getMuenzbestand() {
        return muenzbestand;
    }

    // Methode, um Rückgeld für den Einzahlbetrag und den zu zahlenden Betrag zu berechnen
    public int[] berechneRueckgeld(int einzahlung, int zahlbetrag) {
        int[] rueckgeld = new int[8];
        int differenz = einzahlung - zahlbetrag;

        if (differenz < 0) {
            System.out.println("Fehler: Nicht genügend Geld eingezahlt.");
            return rueckgeld;
        }

        for (int i = 0; i < muenzbestand.length; i++) {
            int anzahl = Math.min(differenz / getMuenzwert(i), muenzbestand[i]);
            rueckgeld[i] = anzahl;
            differenz -= anzahl * getMuenzwert(i);
            muenzbestand[i] -= anzahl;
        }

        if (differenz > 0) {
            System.out.println("Fehler: Kein passendes Rückgeld verfügbar.");
            return new int[8];
        }

        return rueckgeld;
    }

    // Hilfsmethode zur Berechnung des Münzwerts basierend auf dem Index
    private int getMuenzwert(int index) {
        switch (index) {
            case 0: return 200;
            case 1: return 100;
            case 2: return 50;
            case 3: return 20;
            case 4: return 10;
            case 5: return 5;
            case 6: return 2;
            case 7: return 1;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        // Beispiel für die Verwendung der Klasse
        int[] muenzbestand1 = {2, 2, 2, 2, 2, 2, 2, 2};
        int[] muenzbestand2 = {1, 3, 0, 4, 2, 1, 3, 5};

        Rueckgabeautomat automat1 = new Rueckgabeautomat(muenzbestand1);
        Rueckgabeautomat automat2 = new Rueckgabeautomat(muenzbestand2);

        int einzahlung = 100; // 1 Euro
        int zahlbetrag = 57;  // 57 Cent

        int[] rueckgeld1 = automat1.berechneRueckgeld(einzahlung, zahlbetrag);
        int[] rueckgeld2 = automat2.berechneRueckgeld(einzahlung, zahlbetrag);

        System.out.println("Rückgeld für Automat 1: " + java.util.Arrays.toString(rueckgeld1));
        System.out.println("Rückgeld für Automat 2: " + java.util.Arrays.toString(rueckgeld2));
        System.out.println("Aktueller Münzbestand von Automat 1: " + java.util.Arrays.toString(automat1.getMuenzbestand()));
        System.out.println("Aktueller Münzbestand von Automat 2: " + java.util.Arrays.toString(automat2.getMuenzbestand()));
    }
}

