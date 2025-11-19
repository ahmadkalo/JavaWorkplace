package Naz;

public class Pascal {

    public static int[][] pascal(int n) {
        int[][] dreieck = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    dreieck[i][j] = 1;
                } else {
                    dreieck[i][j] = dreieck[i-1][j-1] + dreieck[i-1][j];
                }

            }

        }
        return dreieck;

    }

    public static void ausgabe(int[][] dreieck, int n) {
        for (int i = 0; i < n; i++) {
           for (int j = 0; j <= i; j++) {
               System.out.print(dreieck[i][j] + " ");
           }
           System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 5;
        int[][] ergebnis = pascal(n);
        ausgabe(ergebnis, n);
    }


}
