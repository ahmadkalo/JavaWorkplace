package Taschenrechner;

import java.util.Scanner;

public class Taschenrechner {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int a = 0, b = 0;
		char op = '\0';
		a = inputNum(); // 1. Zahl einlesen
		op = sc.next().charAt(0); // Operator einlesen (+ oder /)
		b = inputNum(); // 2. Zahl einlesen
		int c = calc(a, b, op); // Rechenoperation durchfuehren
		System.out.println(c); // Ergebnis ausgeben
		sc.close();
	}

	static int inputNum() {
		
		return sc.nextInt();
	}

	static int calc(int a, int b, char op) {
		int c = 0;
		switch (op) {
		case '+':
			c = add(a, b);
			break;
		case '/':
			c = div(a, b);
			break;
		}
		return c;
	}

	static int add(int a, int b) {
		return a + b;
	}

	static int div(int a, int b) {
		return a / b;
	}
}