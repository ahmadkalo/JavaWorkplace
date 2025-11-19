package DifferenzierbareFunktionen;

public class Nullfkt implements Diffbar {
    
    @Override
    public double eval(double x) {
        return 0;
    }
    
    @Override
    public Diffbar derivat() {
        return this; // Ableitung der Nullfunktion ist wieder die Nullfunktion
    }
    
    @Override
    public double derivat(double x) {
        return 0;
    }
}

