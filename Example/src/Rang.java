
public class Rang {

	public static void main(String[] args) {
		int[] array = { 6, -2, 4, 0, 7, 6, 1, -3 };

		System.out.println(rank(array, 2));

	}

	public static int rank(int[] array, int pos) {
		int rang = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] <= array[pos]) {
				rang++;
			}
		}
		return rang;

	}

}
