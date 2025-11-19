package UeberraschungsEi;

public class UeEiBaby {

    /* Instanzvariablen */

    private Baby item;

    /* Instanzmethoden */

    public void einpacken(Baby item) {
        this.item = item;
    }

    public Baby auspacken() {
        return item;
    }
}
