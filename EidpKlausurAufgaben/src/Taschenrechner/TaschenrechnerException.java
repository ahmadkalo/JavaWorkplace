package Taschenrechner;

import java.util.Scanner;

public class TaschenrechnerException {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a = 0, b = 0;
		char op = '\0';
		try {
			a = inputNum();
			op = sc.next().charAt(0);
			b = inputNum();
			int c = calc(a, b, op);
			System.out.println(c);
		} catch (OutOfRangeException e) {
			System.out.println("Ein Fehler ist aufgetreten: " + e.getMessage());
			e.printStackTrace();
		} catch (DivByZeroException e) {
			System.out.println("Ein Fehler ist aufgetreten: " + e.getMessage());
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			System.out.println("Ein Fehler ist aufgetreten: " + e.getMessage());
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

	static int inputNum() throws OutOfRangeException {
		int x = sc.nextInt();
		if (x < 0 || x > 100)
			throw new OutOfRangeException();
		return x;
	}

	static int calc(int a, int b, char op) throws OutOfRangeException {
		int c = 0;
		switch (op) {
		case '+':
			c = add(a, b);
			break; 
		case '/':
			c = div(a, b);
			break;
		default:
			throw new IllegalArgumentException("Unbekannter Operator");
		}
		return c;
	}

	static int add(int a, int b) throws OutOfRangeException {
		int c = a + b;
		if (c > 100) {
			throw new OutOfRangeException("Ergebnis ist ueber 100");
		}
		return c;
	}

	static int div(int a, int b) throws DivByZeroException {
		if (b == 0) {
			throw new DivByZeroException("Durch null nicht teilbar");
		}
		return a / b;
	}
}
