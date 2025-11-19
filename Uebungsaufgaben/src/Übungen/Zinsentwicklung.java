package Übungen;

import java.util.Scanner;

public class Zinsentwicklung {

	public static void main(String[] args) {

		Scanner ZinsenScanner = new Scanner(System.in);

		double guthaben;
		double zinssatz;
		int laufzeit;

		System.out.println("Guthaben eingeben: ");
		guthaben = ZinsenScanner.nextDouble();

		System.out.println("Zinsatz p.a. eingeben (in %): ");
		zinssatz = ZinsenScanner.nextDouble();

		System.out.println("Laufzeit eingeben (in Jahre): ");
		laufzeit = ZinsenScanner.nextInt();

		ZinsenScanner.close();

		for (int i = 0; i < laufzeit; i++) {
			guthaben = guthaben * (1 + zinssatz / 100);

			double guthabenGerundet = Math.round(guthaben * 100);
			System.out.println("Guthaben nach Jahr " + (i + 1) + ": " + (guthabenGerundet / 100));

		}

	}

}
