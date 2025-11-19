package VektorPunkt2D;

public class Quadrat extends GeoObjekt2D {
    // Instanzvariablen
    private Punkt2D eckeLU; // Linke obere Ecke
    private double kantenl; // Länge der Kanten

    // Konstruktor, der ein Quadrat mit den angegebenen Parametern erstellt
    public Quadrat(String farbe, Punkt2D eckeLU, Punkt2D eckeRO, double kanten) {
        // Ruft den Konstruktor der Elternklasse auf, um die Farbe zu setzen
        super(farbe);
        // Setzt die linke obere Ecke des Quadrats
        this.eckeLU = eckeLU;
        // Berechnet und setzt die Länge der Kanten des Quadrats
        this.kantenl = Math.abs(kanten);
    }

    // Instanzmethoden
    @Override
    // Berechnet den Umfang des Quadrats
    public double umfang() {
        return 4 * kantenl;
    }

    @Override
    // Berechnet die Fläche des Quadrats
    public double flaeche() {
        return kantenl * kantenl;
    }

    @Override
    // Gibt die Position des Quadrats zurück (in diesem Fall die linke obere Ecke)
    public Punkt2D position() {
        return eckeLU;
    }

    @Override
    // Verschiebt das Quadrat zu einer neuen Position (ändert die Position der linken oberen Ecke)
    public void moveTo(Punkt2D point) {
        eckeLU = point;
    }

    // Gibt die linke obere Ecke des Quadrats zurück
    public Punkt2D eckeLU() {
        return eckeLU;
    }

    // Gibt die rechte untere Ecke des Quadrats zurück (basierend auf der linken oberen Ecke und der Kantenlänge)
    public Punkt2D eckeRO() {
        return new Punkt2D(eckeLU.x() + kantenl, eckeLU.y() + kantenl);
    }

    // Gibt die Länge der Kanten des Quadrats zurück
    public double kantenl() {
        return kantenl;
    }

    @Override
    // Skaliert die Größe des Quadrats um den angegebenen Faktor
    public void multiply(double faktor) {
        // Stellt sicher, dass der Faktor positiv ist, um die Größe beizubehalten
        kantenl *= Math.abs(faktor);
    }

    @Override
    // Setzt die Größe des Quadrats auf einen Standardwert zurück (Länge der Kanten = 1)
    public void resize() {
        kantenl = 1;
    }
}

