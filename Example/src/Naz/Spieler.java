package Naz;


public class Spieler {

    Wurfel wurfel;
    String name;
    int punktZahl;

    public Spieler(String name) {
        this.name = name;
        this.punktZahl = 0;
        this.wurfel = new Wurfel();
    }

    public String getName() {
        return name;
    }

    public int getPunktZahl() {
        return punktZahl;
    }

    public void punktPlus() {
        this.punktZahl++;
    }

    public void PunktPlus(int n) {
        this.punktZahl += n;
    }

    public void reset() {
        punktZahl = 0;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Punktzahl: " + this.punktZahl;
    }

    public int wuerfeln() {
        return wurfel.wurfeln();
    }


}
