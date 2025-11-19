package DifferenzierbareFunktionen;

public class KonstFkt implements Diffbar {
    private final double c;

    public KonstFkt(double c) {
        this.c = c;
    }

    @Override
    public double eval(double x) {
        return c;
    }
    
    @Override
    public Diffbar derivat() {
        return new Nullfkt(); // Ableitung einer konstanten Funktion ist die Nullfunktion
    }
    
    @Override
    public double derivat(double x) {
        return 0;
    }
}
