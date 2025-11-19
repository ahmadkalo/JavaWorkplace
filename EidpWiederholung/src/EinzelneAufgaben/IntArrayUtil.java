package EinzelneAufgaben;

import java.util.Arrays;

public class IntArrayUtil {

	public static int[] merge(int[] a, int[] b) throws IllegalArgumentException {
		/*
		 if (!isSorted(a) || !isSorted(b)) {
		        throw new IllegalArgumentException("Eingabearrays müssen sortiert sein.");
		    }
		 */
		int size = a.length + b.length;
		int[] ergebnisArray = new int[size];
		int cursor1 = 0;
		int cursor2 = 0;

		for (int i = 0; i < ergebnisArray.length; i++) {
			if (cursor1 < a.length && (cursor2 >= b.length || a[cursor1] <= b[cursor2])) {
				ergebnisArray[i] = a[cursor1];
				cursor1++;
			} else {
				ergebnisArray[i] = b[cursor2];
				cursor2++;
			}

			if (i > 0 && ergebnisArray[i] < ergebnisArray[i - 1]) {
				throw new IllegalArgumentException("Eingabearrays müssen sortiert sein.");
			}
		}
		return ergebnisArray;

	}
	
	@SuppressWarnings("unused")
	private static boolean isSorted(int[] array) {
	    for (int i = 0; i < array.length - 1; i++) {
	        if (array[i] > array[i + 1]) {
	            return false;
	        }
	    }
	    return true;
	}

	public static void main(String[] args) {

		int[] a = { -3, 12, 34,56,78,89 };
		int[] b = { 0, 8, 15, 42 };

		int[] erg = merge(a, b);

		System.out.println(Arrays.toString(erg));
	}
}
