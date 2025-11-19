package TheorieA5_4;

import DynArray.DynArray;



public class TheorieA5_4 {
	public static void main(String[] args) {
		// Initialisierung des Arrays
		int[] arr = { 1, 2, 3 };

		// Schleife, um über jedes Element des Arrays zu iterieren
		for (int element : arr) {
			element = 42;
			System.out.print( element + " ");
		}

			System.out.println();
	
		for (int num : arr) {
			System.out.print(num + " ");
		}
		
		DynArray<Integer> ahmed = new DynArray<>();
		ahmed.add(1);
		ahmed.add(2);
		ahmed.add(3);
		
		
//		for (int element : ahmed) {
//			element = 42;
//			System.out.print( element + " ");
//		}
//		
//		
//	
	}
}

