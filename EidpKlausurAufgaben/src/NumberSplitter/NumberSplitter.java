package NumberSplitter;

public class NumberSplitter {

	public static int[][] zerlegen(int[] array) {
		int[][] spilter = new int[array.length][2];

			for (int i = 0; i < 2; i++) {
				spilter[i][0] = array[i] / 10;
				spilter[i][1] = array[i] % 10;
				
			
		}

		return spilter;

	}

	public static void main(String[] args) {

		int[] array = { 12, 34, 56 };
		int[][] erg = zerlegen(array);
		
		for (int i = 0; i < erg.length; i++) {
			for (int j = 0; j < erg[i].length; j++) {
				System.out.print(erg[i][j] + " ");
			}
			System.out.println();
		}

	}

}
