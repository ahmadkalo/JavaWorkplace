package Arche;

public class Igel extends Saeugetier {
    public Igel(String name, int lifeExpectancy) {
        super(name, lifeExpectancy);
    }

    @Override
    public String toString() {
        return "[S: " + name + "]";
    }
}


