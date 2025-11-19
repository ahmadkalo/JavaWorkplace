package VektorPunkt2D;

public class Strecke extends GeoObjekt implements Messbar {
    // Instanzvariablen
    private Punkt2D anfP; // Anfangspunkt
    private Punkt2D endP; // Endpunkt

    // Konstruktor, der eine Strecke mit den angegebenen Parametern erstellt
    public Strecke(Punkt2D anfP, Punkt2D endP, String farbe) {
        // Ruft den Konstruktor der Elternklasse auf, um die Farbe zu setzen
        super(farbe);
        // Setzt den Anfangs- und Endpunkt der Strecke
        this.anfP = anfP;
        this.endP = endP;
    }

    // Instanzmethoden
    @Override
    // Gibt die Position der Strecke zurück (hier wird null zurückgegeben, da eine Strecke keine eindeutige Position hat)
    public Punkt2D position() {
        return null;
    }

    @Override
    // Verschiebt die Strecke zu einer neuen Position (ändert die Position des Anfangspunkts und passt den Endpunkt entsprechend an)
    public void moveTo(Punkt2D point) {
        // Berechnet die Verschiebung und passt den Endpunkt entsprechend an
        endP = new Punkt2D(point.x() + endP.x() - anfP.x(), point.y() + endP.y() - anfP.y());
        // Setzt den Anfangspunkt auf die neue Position
        anfP = point;
    }

    // Gibt den Anfangspunkt der Strecke zurück
    public Punkt2D anfP() {
        return anfP;
    }

    // Gibt den Endpunkt der Strecke zurück
    public Punkt2D endP() {
        return endP;
    }

    @Override
    // Berechnet die Länge der Strecke (Entfernung zwischen Anfangs- und Endpunkt)
    public double laenge() {
        double x = anfP.x() - endP.x();
        double y = anfP.y() - endP.y();
        return Math.sqrt(x * x + y * y);
    }
}

