package VektorPunkt2D;

public class Vektor2D extends Punkt2D implements Messbar, Addierbar {
    // Konstruktor für einen Vektor mit den angegebenen Koordinaten
    public Vektor2D(double x, double y) {
        // Ruft den Konstruktor der Elternklasse auf, um die Koordinaten zu setzen
        super(x, y);
    }

    // Konstruktor, der einen Vektor von (0,0) zu einem gegebenen Punkt erstellt
    public Vektor2D(Punkt2D p) {
        // Ruft den Konstruktor der Elternklasse auf, um die Koordinaten des Punkts zu verwenden
        super(p.x(), p.y());
    }

    // Konstruktor, der einen Vektor von einem Startpunkt zu einem Endpunkt erstellt
    public Vektor2D(Punkt2D start, Punkt2D end) {
        // Berechnet die Differenz der End- und Startpunkt-Koordinaten, um den Vektor zu erstellen
        this(end.x() - start.x(), end.y() - start.y());
    }

    // Standardkonstruktor, der einen Nullvektor erstellt
    public Vektor2D() {
        // Ruft den Konstruktor der Klasse mit den angegebenen Koordinaten auf, um einen Nullvektor zu erstellen
        this(0.0, 0.0);
    }

    // Instanzmethoden
    @Override
    // Berechnet die Länge des Vektors
    public double laenge() {
        double x = x();
        double y = y();
        return Math.sqrt(x * x + y * y);
    }

    @Override
    // Skaliert den Vektor um den angegebenen Faktor
    public void multiply(double faktor) {
        // Stellt sicher, dass der Faktor positiv ist, um die Richtung des Vektors beizubehalten
        faktor = Math.abs(faktor);
        // Multipliziert die x- und y-Koordinaten des Vektors mit dem Faktor
        setX(x() * faktor);
        setY(y() * faktor);
    }

    @Override
    // Setzt die Länge des Vektors auf 1, falls der Vektor nicht die Länge 0 hat
    public void resize() {
        // Berechnet die Länge des Vektors
        double length = laenge();
        // Überprüft, ob die Länge nicht 0 ist, um eine Division durch 0 zu verhindern
        if (length != 0) {
            // Skaliert den Vektor, um die Länge auf 1 zu setzen
            multiply(1.0 / length);
        }
    }

    @Override
    // Addiert einen anderen Vektor zu diesem Vektor und gibt das Ergebnis als neuen Vektor zurück
    public Addierbar add(Addierbar other) {
        // Wandelt das andere Objekt in einen Vektor um
        Vektor2D v = (Vektor2D) other;
        // Erstellt einen neuen Vektor, der die Summe der beiden Vektoren ist
        return new Vektor2D(x() + v.x(), y() + v.y());
    }
}

