package WebShop;

public class GuterKunde extends Kunde {
    private double rabatt;

    public GuterKunde(String vorname, String nachname, double nachlass) {
        super(vorname, nachname);
        this.rabatt = nachlass;
    }

    public double getRabatt() {
        return rabatt;
    }

    @Override
    public String toString() {
        return super.toString() + ", Preisnachlass " + (int)(rabatt * 100) + "%";
    }
}

