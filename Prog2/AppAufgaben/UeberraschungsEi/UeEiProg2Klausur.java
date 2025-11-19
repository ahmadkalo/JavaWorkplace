package UeberraschungsEi;

public class UeEiProg2Klausur {

    /* Instanzvariablen */

    private Prog2Klausur item;

    /* Instanzmethoden */

    public void einpacken(Prog2Klausur item) {
        this.item = item;
    }

    public Prog2Klausur auspacken() {
        return item;
    }
}