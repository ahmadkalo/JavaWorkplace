package WeitSprung;

public class Sportler {
    double[] weiten;

    public Sportler(double[] weiten) {
        this.weiten = weiten;
    }

    public double[] weite() {
        return weiten;
    }

    public static Sportler sieger(Sportler[] sportler) {
        Sportler sieger = null;
        double maxWeite = 0.0; 

        for (int i = 0; i < sportler.length; i++) {
            for (int j = 0; j < sportler[i].weite().length; j++) {
                if (sportler[i].weite()[j] > maxWeite) {
                    maxWeite = sportler[i].weite()[j];
                    sieger = sportler[i];
                }
            }
        }
        return sieger;
    }

    public static void main(String[] args) {
        double[] punkte1 = {1.0, 2.0, 3.0, 3.0, 4.0, 6.0};
        double[] punkte2 = {3.0, 2.0, 5.0, 3.0, 7.0, 2.0};
        double[] punkte3 = {1.0, 2.0, 6.0, 1.0, 7.0, 9.0};

        Sportler sportler1 = new Sportler(punkte1);
        Sportler sportler2 = new Sportler(punkte2);
        Sportler sportler3 = new Sportler(punkte3);

        Sportler[] tnFeld = {sportler1, sportler2, sportler3};

        Sportler gewinner = sieger(tnFeld);
        
        double maxWeite = -1;
        for (double weite : gewinner.weite()) {
            if (weite > maxWeite) {
                maxWeite = weite;
            }
        }
        
        System.out.println("Der Gewinner ist der Sportler mit der größten Weite von: " + maxWeite);
    }
}
