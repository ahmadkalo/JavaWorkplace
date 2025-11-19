package VektorPunkt2D;

public class Punkt2D {
    // Instanzvariablen
    private double x; // x-Koordinate
    private double y; // y-Koordinate

    // Konstruktor, der einen Punkt mit den angegebenen Koordinaten erstellt
    public Punkt2D(double x, double y) {
        // Setzt die x- und y-Koordinaten des Punkts
        this.x = x;
        this.y = y;
    }

    // Instanzmethoden
    // Gibt die x-Koordinate des Punkts zurück
    public double x() {
        return x;
    }

    // Gibt die y-Koordinate des Punkts zurück
    public double y() {
        return y;
    }

    // Setzt die x-Koordinate des Punkts
    public void setX(double x) {
        this.x = x;
    }

    // Setzt die y-Koordinate des Punkts
    public void setY(double y) {
        this.y = y;
    }

    // Berechnet den Abstand zwischen diesem Punkt und einem anderen Punkt
    public double abstand(Punkt2D other) {
        double dx = x - other.x;
        double dy = y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

