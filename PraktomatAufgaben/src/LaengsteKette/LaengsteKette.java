package LaengsteKette;

import java.util.Scanner;

public class LaengsteKette {

	public static void main(String[] args) {

		int AktuelleZahl = 0;
		int Zaehler = 0;
		int MaxZaehler = 0;

		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextInt()) {
			int i = scanner.nextInt();

			if (i == AktuelleZahl) {
				Zaehler++;
			} else {
				AktuelleZahl = i;
				Zaehler = 1;
			}

			if (Zaehler > MaxZaehler) {
				MaxZaehler = Zaehler;

			}

		}

		System.out.println(MaxZaehler);
		scanner.close();
	}

}