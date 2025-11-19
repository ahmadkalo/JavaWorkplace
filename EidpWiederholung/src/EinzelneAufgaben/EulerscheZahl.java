package EinzelneAufgaben;

public class EulerscheZahl {

    // Methode zur Approximation der Eulerschen Zahl e
    public static double berechneE(double epsilon) {
        double e = 1.0;   // Initialisiere den Wert von e (der erste Term ist 1/0! = 1)
        double summand = 1.0; // Initialisiere den ersten Term 1/0! = 1
        long k = 1;       // Beginne mit dem zweiten Term (k=1)
        long fakultaet = 1; // Initialisiere die Fakultät als 1

        // Schleife, bis der Term kleiner als epsilon ist oder die maximale Iterationsanzahl erreicht ist
        while (summand >= epsilon && k <= 1000000) {
            fakultaet *= k; // Berechne k!
            summand = 1.0 / fakultaet; // Berechne den nächsten Term 1/k!
            e += summand; // Füge den Term zur Summe hinzu
            k++; // Gehe zum nächsten Term über
        }

        return e; // Gib den Wert von e zurück
    }

    public static void main(String[] args) {
        double epsilon = 0.001; // Beispielwert für epsilon
        double ergebnis = berechneE(epsilon);
        System.out.println("Der Wert von e für epsilon " + epsilon + " ist: " + ergebnis);
    }
}

