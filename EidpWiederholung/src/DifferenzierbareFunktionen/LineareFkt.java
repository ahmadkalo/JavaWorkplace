package DifferenzierbareFunktionen;

public class LineareFkt implements Diffbar {
    private final double a;
    private final double b;

    public LineareFkt(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double eval(double x) {
        return a * x + b;
    }
    
    @Override
    public Diffbar derivat() {
        return new KonstFkt(a); // Ableitung einer linearen Funktion ist die konstante Funktion a
    }
    
    @Override
    public double derivat(double x) {
        return a;
    }
}
