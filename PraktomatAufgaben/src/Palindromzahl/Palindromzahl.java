package Palindromzahl;

public class Palindromzahl {

	public static int spiegeln(int zahl) {
		int spiegel = 0;
		while (zahl > 0) {
			spiegel = spiegel * 10 + zahl % 10;
			zahl /= 10;
		}
		return spiegel;
	}

	public static int spiegelAddieren(int zahl) {
		return zahl + spiegeln(zahl);
	}

	public static boolean palindromTest(int zahl) {
		return zahl == spiegeln(zahl);
	}

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Das ist keine positive Zahl.");
			return;
		}

		int n = Integer.parseInt(args[0]);
		int spiegel = spiegeln(n);

		n = spiegelAddieren(n);
		System.out.println(spiegel);
		System.out.println(n);

		while (!palindromTest(n)) {
			n = spiegelAddieren(n);

		}
		System.out.println(n);
	}

}
