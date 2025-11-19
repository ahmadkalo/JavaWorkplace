package StudentModul;

public class Modul {

    // Instanzattribute

    private String titel;
    private int anzTN;
    private int cp;
    private int maxTNZahl;
    private Student[] tnListe;

    // Konstruktor

    public Modul(String titel, int cp, int max) {
        this.titel = titel;
        this.cp = cp;
        this.anzTN = 0;
        this.maxTNZahl = max;
        this.tnListe = new Student[max];
    }

    public Modul(String titel, int cp) {
        this(titel, cp, 100);
    }

    // keine set-Methoden, aber get:

    public String titel() {
        return titel;
    }

    public int anzTN() {
        return anzTN;
    }

    public int cp() {
        return cp;
    }

    // weitere Methoden

    public void aufnehmen(Student s) throws KeinPlatzMehrException {
        if (nochPlatzFrei()) {
            tnListe[anzTN] = s;
            anzTN++;
        } else {
            throw new KeinPlatzMehrException("Kein Platz mehr im Modul " + titel);
        }
    }

    public String toString() {
        return titel + " " + anzTN;
    }

    private boolean nochPlatzFrei() {
        return anzTN < maxTNZahl; // Anpassen der Bedingung
    }

    public void druckeTNListe() {
        System.out.println("TN-Liste des Moduls " + titel);
        for (int i = 0; i < anzTN; i++) {
            System.out.println(tnListe[i]);
        }
    }

}
