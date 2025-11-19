package Gewaesser;

public class Test {

    public static void main(String[] args) {
        Meer meer = new Meer(null);
    
        double meerTiefe = (int) meer.tiefe();
        System.out.println("Die Tiefe des Meeres beträgt: " + meerTiefe);

        Fluss fluss = new Fluss(meer);
        double flussTiefe = (int) fluss.tiefe();
        System.out.println("Die Tiefe des Flusses beträgt: " + flussTiefe);
        

        Gewaesser muendetIn = fluss.getMuendetIn();
        if (muendetIn instanceof Meer) {
            System.out.println("Der Fluss mündet ins Meer.");
        } else {
            System.out.println("Der Fluss mündet nicht ins Meer.");
        }
        
        Gewaesser muendetIn2 = meer.getMuendetIn();
        if (muendetIn2 instanceof Fluss) {
            System.out.println("Der Fluss mündet ins Meer.");
        } else {
            System.out.println("Das Meer mündet nicht in den Fluss.");
        }
    }
}
