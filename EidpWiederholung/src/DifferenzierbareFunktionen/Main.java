package DifferenzierbareFunktionen;

public class Main {
    public static void main(String[] args) {
        // Test Nullfkt
        Nullfkt nullfkt = new Nullfkt();
        System.out.println("Nullfkt eval(2): " + nullfkt.eval(2)); // Erwartet: 0
        System.out.println("Nullfkt derivat(2): " + nullfkt.derivat(2)); // Erwartet: 0

        // Test KonstFkt
        KonstFkt konstFkt = new KonstFkt(5);
        System.out.println("KonstFkt eval(2): " + konstFkt.eval(2)); // Erwartet: 5
        System.out.println("KonstFkt derivat(2): " + konstFkt.derivat(2)); // Erwartet: 0

        // Test LineareFkt
        LineareFkt lineareFkt = new LineareFkt(3, 4);
        System.out.println("LineareFkt eval(2): " + lineareFkt.eval(2)); // Erwartet: 10
        System.out.println("LineareFkt derivat(2): " + lineareFkt.derivat(2)); // Erwartet: 3

        // Test Polynom
        Polynom polynom = new Polynom(1, -2, 1); // f(x) = 1 - 2x + x^2
        System.out.println("Polynom eval(2): " + polynom.eval(2)); // Erwartet: 1
        System.out.println("Polynom derivat(2): " + polynom.derivat(2)); // Erwartet: 0

        // Test Ableitung von Polynom
        Diffbar abgeleitetesPolynom = polynom.derivat(); // f'(x) = -2 + 2x
        System.out.println("Abgeleitetes Polynom eval(2): " + abgeleitetesPolynom.eval(2)); // Erwartet: 2
        System.out.println("Abgeleitetes Polynom derivat(2): " + abgeleitetesPolynom.derivat(2)); // Erwartet: 2
    }
}