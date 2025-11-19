package EinzelAufgaben;

public class Tausch {

	public static void tauschen(int[] array) {

		for (int i = 0; i < array.length / 2; i++) {

			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;

		}

	}

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };

		tauschen(array);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
