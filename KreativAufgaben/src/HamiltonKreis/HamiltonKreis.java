package HamiltonKreis;

public class HamiltonKreis {
    public static String[] hamiltonKreisHypercube(int n) {
        if (n < 2) {
            return null; // Für n < 2 ist die Rückgabe null
        }
        int numVertices = (int) Math.pow(2, n); // Anzahl der Knoten im Hypercube
        String[] result = new String[numVertices];

        // Gray-Code-Algorithmus für die Hamiltonischen Kreis
        for (int i = 0; i < numVertices; i++) {
            result[i] = intToBinaryString(i ^ (i >> 1), n);
        }
        return result;
    }

    // Hilfsmethode um Integer in Binärstring der Länge n zu konvertieren
    private static String intToBinaryString(int value, int length) {
        String binaryString = Integer.toBinaryString(value);
        while (binaryString.length() < length) {
            binaryString = "0" + binaryString;
        }
        return binaryString;
    }

    public static void main(String[] args) {
        int n = 2; // Beispiel für H2
        String[] hamiltonKreis = hamiltonKreisHypercube(n);
        if (hamiltonKreis != null) {
            for (String s : hamiltonKreis) {
                System.out.print(s + " ");
            }
        } else {
            System.out.println("null");
        }
    }
}
