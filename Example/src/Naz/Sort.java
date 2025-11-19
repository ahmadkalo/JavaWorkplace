package Naz;


public class Sort {

    public static void selectionSort(int[] arrayRan) {

        for (int i = 0; i < arrayRan.length; i++) {
            int min = i;
            for (int j = i + 1; j < arrayRan.length; j++) {
                if (arrayRan[j] < arrayRan[min]) {
                    min = j;

                }
            }
            int temp = arrayRan[min];
            arrayRan[min] = arrayRan[i];
            arrayRan[i] = temp;

        }
    }




}
