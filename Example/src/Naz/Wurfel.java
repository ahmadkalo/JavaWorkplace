package Naz;

import java.util.Random;

public class Wurfel {


    static Random generatpr = new Random();
    int wert;

    public Wurfel() {
        this.wert = wurfeln();
    }

    public int getWert() {
        return wert;
    }

    public int wurfeln() {
        wert = generatpr.nextInt(6) + 1;
        return wert;
    }

    public static boolean pasch(Wurfel wurfel1, Wurfel wurfel2) {
        return wurfel1.getWert() == wurfel2.getWert();
    }

}
