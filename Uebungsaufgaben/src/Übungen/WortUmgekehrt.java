package Übungen;

import java.util.Scanner;

public class WortUmgekehrt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte Wort eingeben: ");

		String input = scanner.next();
		String output = "";

		for (int i = 0; i < input.length(); i++) {
			output = output + input.charAt(input.length() - 1 - i);

		}

		System.out.println(output);
		scanner.close();
	}

}
