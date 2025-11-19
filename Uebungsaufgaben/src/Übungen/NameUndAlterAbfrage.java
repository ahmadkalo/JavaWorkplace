package Übungen;
import java.util.Scanner;

public class NameUndAlterAbfrage {

	public static void main(String[] args) {

		Scanner AbfrageScanner = new Scanner(System.in);
		System.out.println("Geben Sie bitte Ihren Vor und Nachnamen ein: ");
		String name = AbfrageScanner.nextLine();

		System.out.println("Geben Sie bitte Ihr Alter ein: ");
		int alter = AbfrageScanner.nextInt();

		System.out.println("Hallo " + name + ", " + "du bist " + alter + " Jahre alt");
		AbfrageScanner.close();
	}

}
