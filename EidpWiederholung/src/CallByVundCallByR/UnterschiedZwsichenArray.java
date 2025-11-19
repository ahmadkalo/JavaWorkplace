package CallByVundCallByR;

import java.util.Arrays;

public class UnterschiedZwsichenArray {
	

    public static void aendereZahl(int z) {
        z = 10; // Ändert nur die Kopie, nicht die ursprüngliche Variable
    }

    public static void aendereArray(int[] arr) {
        arr[0] = 10; // Ändert das ursprüngliche Array, da die Referenzkopie auf dasselbe Array zeigt
    }
    
   
    public static void main(String[] args) {
        int zahl = 5;
        aendereZahl(zahl);
        System.out.println("Nach aendereZahl: " + zahl); // Ausgabe: 5

        int[] array = {1, 2, 3};
        aendereArray(array);
        System.out.println("Nach aendereArray: " + Arrays.toString(array)); 
    }

}
