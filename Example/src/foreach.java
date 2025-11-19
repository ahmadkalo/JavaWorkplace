public class foreach {

    public static long berechneNenner(int n) {
        if (n == 1) {
            return 1;
        }
        return n * berechneNenner(n - 1);
    }

    public static long berechneZaehler(int start, int count) {
        if (count == 0) {
            return 1;
        }
        return start * berechneZaehler(start - 1, count - 1);
    }

    public static void main(String[] args) {
        long zaehler = berechneZaehler(49, 6);
        long nenner = berechneNenner(6);

        // Endgültiges Ergebnis durch Division
        long ergebnis = zaehler / nenner;

        System.out.println(ergebnis);
    }


}

