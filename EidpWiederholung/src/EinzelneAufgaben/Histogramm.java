package EinzelneAufgaben;

public class Histogramm {

    public static void histo(int[] array) {
        int[] hilfsarray = new int[10];

        for (int i = 0; i < array.length; i++) {
            int zahl;
            zahl = array[i];
            hilfsarray[zahl]++;

        }
        ausgabe(hilfsarray);

    }

    public static void ausgabe(int[] hilfsarray) {
        for (int i = 0; i < hilfsarray.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < hilfsarray[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[] n = {6, 8, 1, 8, 5, 2, 2, 3, 7, 1, 5, 3, 1, 0, 1, 5, 6, 6, 9};
        histo(n);
    }

}
