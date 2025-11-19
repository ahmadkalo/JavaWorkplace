package Schach;

public class Main {

	public static void main(String[] args) {

		Bauer b1 = new Bauer(new Punkt2D(0, 1), true);
		Bauer b2 = new Bauer(new Punkt2D(0, 6), false);

		System.out.println(b1);
		System.out.println(b2);

		try {
			b1.step(1, "vorne");
			b2.step(1, "vorne");
			System.out.println(b1);
			System.out.println(b2);

		} catch (UngueltigeBewegung x) {
			System.out.println(x.getMessage());

		}
	}

}
