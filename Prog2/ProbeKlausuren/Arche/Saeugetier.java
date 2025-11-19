package Arche;


public abstract class Saeugetier implements Tier {
    protected String name;
    protected int lifeExpectancy;

    public Saeugetier(String name, int lifeExpectancy) {
        this.name = name;
        this.lifeExpectancy = lifeExpectancy;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLifeExpectancy() {
        return lifeExpectancy;
    }
}
