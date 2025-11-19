package EinzelneAufgaben;

public class Ulam {

	public static int ulam(int a) {
		return ulamHelper(a);
	}

	private static int ulamHelper(int n) {
		if (n == 1) {

			return 1;

		} else if (n % 2 == 0) {
			return ulamHelper(n / 2);

		} else {
			return ulamHelper(3 * n + 1);
		}

	}

	public static void main(String[] args) {
		int n = 17;
		System.out.println(ulamHelper(n));
	}

}
