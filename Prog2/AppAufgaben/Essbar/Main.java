package Essbar;

public class Main {

    /* Klassenmethoden */

    public static void main(String[] args) {

        Lebewesen mario = new Mensch(99, "Mario");
        Lebewesen dozent = new Mensch(1, "André Kless, M.Sc.");
        Essbar hotDog = new Hund(2, "Hitzig");

        Essbar[] moeter = {mario, hotDog};

        for (int i = 0; i < moeter.length; i++) {
            dozent.essen(moeter[i]);
        }

        //mario.essen(dozent);

        Hund h = (Hund) hotDog;
        h.essen(() -> {
            System.out.println("Hund isst unsterbliche Katze.");
        });
    }
}
