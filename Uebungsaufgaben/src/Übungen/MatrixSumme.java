package Übungen;
public class MatrixSumme {

    public static void main(String[] args) {
        // Erstelle eine 3x3-Matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Berechne die Summe der Elemente in der Matrix
        int summe = berechneMatrixSumme(matrix);

        // Gib die Summe aus
        System.out.println("Die Summe der Elemente in der Matrix beträgt: " + summe);
    }

    // Methode zur Berechnung der Summe der Elemente in einer Matrix
    public static int berechneMatrixSumme(int[][] matrix) {
        int summe = 0;

        // Durchlaufe jede Zeile und jede Spalte der Matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                summe += matrix[i][j]; // Addiere jedes Element zur Summe hinzu
            }
        }

        return summe;
    }
}
