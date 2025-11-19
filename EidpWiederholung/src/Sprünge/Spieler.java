package Sprünge;

import static EinzelneAufgaben.Histogramm.ausgabe;

public class Spieler {

    private double[] versuche = new double[6];

    public Spieler(double[] versuche) {
        if (versuche.length == 6) {
            this.versuche = versuche;
        }

    }

    public double[] getVersuche() {
        return versuche;
    }

    public static void sieger(Spieler[] sp) {
        int sieger = 0;
        double max = 0.0;
        for (int i = 0; i < sp.length; i++) {
            double[] weite = sp[i].getVersuche();
            for (int j = 0; j < weite.length; j++) {
                if (weite[j] > max) {
                    max = weite[j];
                    sieger = i;

                }
            }

        }

        System.out.println("Der Spieler mit den Punkten: " + ausgabeArray(sp[sieger]) + " hat gewonnen!");

    }

    private static String ausgabeArray(Spieler spieler) {
        String ausgabe = "";
        for (int i = 0; i < spieler.versuche.length; i++) {
            if (spieler.versuche[i] == spieler.versuche[spieler.versuche.length-1]) {
                ausgabe += spieler.versuche[i];

            } else {
                ausgabe += spieler.versuche[i] + ", ";
            }
        }
        return ausgabe;
    }

    public static void main(String[] args) {

        Spieler naz = new Spieler(new double[]{7.0, 6.8, 6.9, 7.1, 6.7, 6.5});
        Spieler ahmed = new Spieler(new double[]{6.0, 6.2, 6.1, 6.3, 6.4, 6.6});

        Spieler[] spieler = new Spieler[]{naz, ahmed};

        sieger(spieler);


    }


}


