package DifferenzierbareFunktionen;

public class Polynom implements Diffbar {
    private final double[] koeffizienten;

    public Polynom(double... koeffizienten) {
        this.koeffizienten = koeffizienten;
    }

    @Override
    public double eval(double x) {
        double result = 0;
        for (int i = 0; i < koeffizienten.length; i++) {
            result += koeffizienten[i] * Math.pow(x, i);
        }
        return result;
    }
    
    @Override
    public Diffbar derivat() {
        if (koeffizienten.length == 1) {
            return new Nullfkt(); // Ableitung eines konstanten Polynoms ist Null
        }
        double[] ableitungKoeffizienten = new double[koeffizienten.length - 1];
        for (int i = 1; i < koeffizienten.length; i++) {
            ableitungKoeffizienten[i - 1] = koeffizienten[i] * i;
        }
        return new Polynom(ableitungKoeffizienten);
    }
    
    @Override
    public double derivat(double x) {
        return derivat().eval(x);
    }
}

