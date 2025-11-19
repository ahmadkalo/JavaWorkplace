package Rational;

import java.util.Scanner;

public class RationalTest {

	/* Klassenmethoden */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Erster Bruch
		int zähler = sc.nextInt();
		int nenner = sc.nextInt();
		Rational a = new Rational(zähler, nenner);
		Rational result = a;

		while (sc.hasNext()) {

			char operation = sc.next().charAt(0);
			if (operation == '.')
				break;
			Rational b = new Rational(sc.nextInt(), sc.nextInt());

			if (operation == '+')
				result = result.add(b);
			else if (operation == '-')
				result = result.sub(b);
			else if (operation == '*')
				result = result.mul(b);
			else
				result = result.div(b);

		}

		System.out.print(result.toString());
		sc.close();
	}

}
