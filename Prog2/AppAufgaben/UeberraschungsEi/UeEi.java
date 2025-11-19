package UeberraschungsEi;

public class UeEi<T> implements Packbar<T> {

    /* Instanzvariablen */

    private T item;

    /* Instanzmethoden */

    @Override
    public void einpacken(T item) {
        this.item = item;
    }

    @Override
    public T auspacken() {
        return item;
    }
}
