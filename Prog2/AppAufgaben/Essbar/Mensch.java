package Essbar;

public class Mensch extends Lebewesen {

    /* Instanzvariablen */

    private String name;

    /* Konstruktoren */

    public Mensch(int leben, String name) {
        super(leben);
        this.name = name;
    }

    /* Instanzmethoden */

    @Override
    public void essen(Essbar mahlzeit) {
        if (mahlzeit instanceof Hund) {
            Hund hund = (Hund) mahlzeit;
            if (hund.getTemperament().equals("Hitzig")) {
                System.out.println(this.name + " isst einen Hot Dog.");
            } else {
                System.out.println("Menschen essen keine Hunde!");
                return;
            }
        }
        mahlzeit.wirdGefressen();
        System.out.println(this.name + " hat " + mahlzeit.getClass().getSimpleName() + " gefressen.");
    }
}
