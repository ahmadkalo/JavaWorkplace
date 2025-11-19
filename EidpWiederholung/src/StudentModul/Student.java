package StudentModul;

public class Student extends Person {


    // Klassenvariable
    private static int counter = 0; // zaehlt die Anzahl der Objekte

    // Instanzvariablen (zusaetzliche)
    private int matNr;
    @SuppressWarnings("unused")
	private int anzModule;  // Anzahl der belegten Module
    private int cp;

    // Konstruktor
    public Student(String name, int jahr) {
        super(name, jahr);
        this.matNr = 1000 + counter++;
        this.anzModule = 0;
        this.cp = 0;
    }

    // Klassenmethoden
    public static int getAnzahlObjekte() {
        return counter;
    }

    // Instanzmethoden

    public int matNr() {
        return this.matNr;
    }

    public int cp() {
        return this.cp;
    }

    public void belegen(Modul m) throws KeinPlatzMehrException {
        m.aufnehmen(this);
        anzModule++;
    }

    public void pruefung(Modul m, double note) {
        if (note < 5.0)
            this.cp = this.cp + m.cp();
    }

    public String toString() {
        return "(" + matNr + ") " + getName();
    }

}
