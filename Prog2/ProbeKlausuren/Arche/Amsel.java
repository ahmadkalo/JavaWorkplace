package Arche;

public class Amsel extends Vogel {
    public Amsel(String name, int lifeExpectancy) {
        super(name, lifeExpectancy);
    }

    @Override
    public String toString() {
        return "[V: " + name + "]";
    }
}
