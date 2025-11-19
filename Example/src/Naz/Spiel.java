package Naz;

public class Spiel {

    static int[] highScore = new int[10];
    static int anzahlEintraege = 0;

    public static void eintragen(int punktZahl) {

        if (anzahlEintraege < 10) {
            int i = anzahlEintraege - 1;

            while (i >= 0 && highScore[i] < punktZahl) {
                highScore[i + 1] = highScore[i];
                i--;

            }

            highScore[i + 1] = punktZahl;
            anzahlEintraege++;

        } else {
            if (punktZahl > highScore[9]) {
                int i = 8;
                while (i >= 0 && highScore[i] < punktZahl) {
                    highScore[i + 1] = highScore[i];
                    i--; // -1
                }
                highScore[i + 1] = punktZahl;
            }

        }
    }


}
