package Schach;

public class SchachSpielMain {
	public static void main(String[] args) {
		try {
			System.out.println("----------------------------------------------------------------");
			Bauer bauer1 = new Bauer(new Punkt2D(0, 1), "weiß", true);
			Bauer bauer2 = new Bauer(new Punkt2D(0, 6), "schwarz", false);
			Bauer bauer3 = new Bauer(new Punkt2D(1, 6), "schwarz", false);
			bauer1.step(1, "vorne");
			bauer2.step(1, "vorne");
			System.out.println(bauer1);
			System.out.println(bauer2);
			System.out.println(bauer3);

			System.out.println("----------------------------------------------------------------");
			Koenig koenig = new Koenig(new Punkt2D(4, 0), "weiß", true);
			koenig.step(1, "links");
			koenig.step(1, "diagonal oben links");
			System.out.println(koenig);

			System.out.println("----------------------------------------------------------------");
			Dame dame = new Dame(new Punkt2D(3, 0), "weiß", true);
			dame.step(3, "diagonal oben links");
			System.out.println(dame);

			System.out.println("----------------------------------------------------------------");
			Springer springer = new Springer(new Punkt2D(1, 1), "schwarz", false);
			System.out.println(springer);
			springer.step(3,"NOO");

			System.out.println("----------------------------------------------------------------");
			Turm turm = new Turm(new Punkt2D(7, 0), "weiß", true);
			turm.step(5, "links");
			System.out.println(turm);

			
			System.out.println("----------------------------------------------------------------");
			Laeufer laeufer1Weiss = new Laeufer(new Punkt2D(5, 0), "weiß", true);
			Laeufer laeufer2Weiss = new Laeufer(new Punkt2D(2, 0), "weiß", true);
			laeufer1Weiss.step(5, "diagonal oben links");
			laeufer2Weiss.step(2, "diagonal oben rechts");
			System.out.println(laeufer1Weiss);
			System.out.println(laeufer2Weiss);
			
			
		} catch (UngueltigeBewegungException e) {
			System.out.println(e.getMessage());
		}
	}
}
