package Essbar;


public class Hund extends Lebewesen {

    /* Instanzvariablen */

    private final String temperament;

    /* Konstruktoren */

    public Hund(int alter, String temperament) {
        super(alter);
        this.temperament = temperament;
    }

    /* Instanzmethoden */

    public String getTemperament() {
        return temperament;
    }

    @Override
    public void essen(Essbar futter) {
        futter.wirdGefressen();
    }
}

