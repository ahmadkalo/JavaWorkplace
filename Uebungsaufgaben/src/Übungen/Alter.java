package Übungen;

import java.util.Scanner;

public class Alter {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int Alter;

		Scanner AlterSc = new Scanner(System.in);

		System.out.println("Geben Sie bitte Ihr Alter ein: ");
		Alter = AlterSc.nextInt();

		if (Alter >= 18) {
			System.out.println("Sie sind volljährig");

		} else
			System.out.println("Sie sind minderjährig");

		System.out.println("Sie werden noch in " + (18 - Alter) + " Jahren volljährig");

	}

}
