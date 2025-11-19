package Taschenrechner;
import java.util.Scanner;

public class Taschenrechner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int zahl1 = sc.nextInt();
		char operator = sc.next().charAt(0);
		int zahl2 = sc.nextInt();
		int ergebnis = berechne(zahl1, zahl2, operator);

		System.out.println("Ergebnis: " + ergebnis);
		sc.close();

	}

	public static int addieren(int zahl1, int zahl2) {

		return zahl1 + zahl2;
	}

	public static int subtrahieren(int zahl1, int zahl2) {

		return zahl1 - zahl2;
	}

	public static int multiplizieren(int zahl1, int zahl2) {

		return zahl1 * zahl2;
	}

	public static int dividieren(int zahl1, int zahl2) {

		if (zahl2 != 0) {
			return zahl1 / zahl2;
		} else {
			System.out.println("Division durch Null ist nicht erlaubt.");
			return 0;
		}
	}

	public static int berechne(int zahl1, int zahl2, char operator) {
		if (operator == '+') {
			return addieren(zahl1, zahl2);
		} else if (operator == '-') {
			return subtrahieren(zahl1, zahl2);
		} else if (operator == '*') {
			return multiplizieren(zahl1, zahl2);
		} else if (operator == '/') {
			return dividieren(zahl1, zahl2);
		} else {
			System.out.println("Ungültiger Operator");
			return 0;
		}
	}
}
