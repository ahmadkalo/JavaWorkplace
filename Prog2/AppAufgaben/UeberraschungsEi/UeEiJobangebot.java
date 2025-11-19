package UeberraschungsEi;

public class UeEiJobangebot {

    /* Instanzvariablen */

    private Jobangebot item;

    /* Instanzmethoden */

    public void einpacken(Jobangebot item) {
        this.item = item;
    }

    public Jobangebot auspacken() {
        return item;
    }
}
