package Zeichenblatt;

public class Array {

    public static int[][] zerlegen(int[] arr) {

        int[][] zweiD = new int[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            zweiD[i][0] = arr[i] / 10;
            zweiD[i][1] = arr[i] % 10;

        }

        return zweiD;
    }


    public static void main(String[] args) {
        int[] aar = {12, 34, 56};
        int[][] zweiD = zerlegen(aar);

        for (int i = 0; i < zweiD.length; i++) {
            for (int j = 0; j < zweiD[i].length; j++) {
                System.out.print(zweiD[i][j] + " ");
            }
            System.out.println();
        }


    }
}
