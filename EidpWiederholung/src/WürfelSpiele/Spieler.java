package WürfelSpiele;


public class Spieler {
    private String name;
    private int punktzahl;
    private Wurfel wurfel;

    public Spieler(String name) {
        this.name = name;
        this.punktzahl = 0;
        this.wurfel = new Wurfel();
    }

    public String getName() {
        return name;
    }

    public int punkte() {
        return punktzahl;
    }

    public void punktPlus() {
        punktzahl++;
    }

    public void punktPlus(int n) {
        punktzahl += n;
    }

    public void reset() {
        punktzahl = 0;
    }

    @Override
    public String toString() {
        return name + " (" + punktzahl + " Punkte)";
    }

    public int wuerfeln() {
        return wurfel.wurfeln();
    }
}
