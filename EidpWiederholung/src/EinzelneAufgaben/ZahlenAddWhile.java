package EinzelneAufgaben;

public class ZahlenAddWhile {

	public static int addiere(int n) {

		if (n < 0) {
			return 0;
		}
		int erg = 0;
		int geradeZahl = 2;

		while (erg < n) {
			erg += geradeZahl;
			geradeZahl += 2;
		}

		return erg;

	}

	public static void main(String[] args) {

		int n = 10;
		System.out.println(addiere(n));
	}
}
