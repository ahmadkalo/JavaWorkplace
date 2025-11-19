package EinzelAufgaben;

public class Corona {

    public static double[] berechne7TageInzidenz(double[] inzidenzWerte) {
        int tage = 30;
        double[] gleitendeDurchschnitte = new double[tage];
        
        for (int i = 0; i < tage; i++) {
            double summe = 0;
            for (int j = 0; j < 7; j++) {
                summe += inzidenzWerte[inzidenzWerte.length - tage - 7 + i + j];
            }
            gleitendeDurchschnitte[i] = summe / 7;
        }
        
        return gleitendeDurchschnitte;
    }

    public static void main(String[] args) {
        // Beispielwerte
        double[] inzidenzWerte = new double[365];
        for (int i = 0; i < 365; i++) {
            inzidenzWerte[i] = Math.random() * 100; // Zufällige Inzidenzwerte
        }

        double[] ergebnisse = berechne7TageInzidenz(inzidenzWerte);

        for (double wert : ergebnisse) {
            System.out.println(wert);
        }
    }
}
