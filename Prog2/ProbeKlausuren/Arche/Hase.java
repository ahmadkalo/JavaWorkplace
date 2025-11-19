package Arche;

public class Hase extends Saeugetier {
    public Hase(String name, int lifeExpectancy) {
        super(name, lifeExpectancy);
    }

    @Override
    public String toString() {
        return "[H: " + name + "]";
    }
}