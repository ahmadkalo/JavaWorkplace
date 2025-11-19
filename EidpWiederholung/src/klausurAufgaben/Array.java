package klausurAufgaben;

public class Array {

	public static double teilSumme(double[] array, int i, int j) throws FalscheParameterException {
		if (i < 0 || j > array.length || i >= j) {
			throw new FalscheParameterException("unglütige Parameter");
		}

		double summe = 0.0;
		for (int t = i; t <= j; t++) {
			summe += array[t];
		}
		return summe;

	}

	public static void main(String[] args) {

		testTeilSumme();
	}

	public static void testTeilSumme() {

		double[] array = { 1.0, 2.0, 3.0, 4.0, 5.0 };

		int i = 1;
		int j = 3;
		try {
			double summe = teilSumme(array, i, j);

			System.out.println(summe);

		} catch (FalscheParameterException e) {
			System.out.println(e.getMessage());

		}

	}

}
