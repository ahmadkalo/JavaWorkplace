package UeberraschungsEi;

@SuppressWarnings("rawtypes")
public class UeEiObject implements Packbar {

    /* Instanzvariablen */

    private Object item;

    /* Instanzmethoden */

    @Override
    public void einpacken(Object item) {
        this.item = item;
    }

    @Override
    public Object auspacken() {
        return item;
    }
}
