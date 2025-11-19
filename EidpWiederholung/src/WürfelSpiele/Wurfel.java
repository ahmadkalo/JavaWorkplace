package WürfelSpiele;

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

    public static void main(String[] args) {

        Wurfel wurfel1a = new Wurfel();
        Wurfel wurfel1b = new Wurfel();
        Wurfel wurfel2a = new Wurfel();
        Wurfel wurfel2b = new Wurfel();

        System.out.println("Spieler 1 : " + wurfel1a.getWert() + ", " + wurfel1b.getWert());
        System.out.println("Spieler 2 : " + wurfel2a.getWert() + ", " + wurfel2b.getWert());

        boolean spieler1Pasch = Wurfel.pasch(wurfel1a, wurfel1b);
        boolean spieler2Pasch = Wurfel.pasch(wurfel2a, wurfel2b);


        if (spieler1Pasch && !spieler2Pasch) {
            System.out.println("Spieler 1 gewinnt");
        } else if (spieler2Pasch && !spieler1Pasch) {
            System.out.println("Spieler 2 gewinnt");
        } else if (spieler2Pasch && spieler1Pasch) {

            int summe1 = wurfel1a.getWert() + wurfel1b.getWert();
            int summe2 = wurfel2a.getWert() + wurfel2b.getWert();

            if (summe1 > summe2) {
                System.out.println("Spieler 1 gewinnt");
            } else if (summe1 < summe2) {
                System.out.println("Spieler 2 gewinnt");
            } else {
                System.out.println("unentschieden");

            }
        } else {
            int summe1 = wurfel1a.getWert() + wurfel1b.getWert();
            int summe2 = wurfel2a.getWert() + wurfel2b.getWert();

            if (summe1 > summe2) {
                System.out.println("Spieler 1 gewinnt");
            } else if (summe1 < summe2) {
                System.out.println("Spieler 2 gewinnt");
            } else {
                System.out.println("unentschieden");
            }


        }

    }


}
