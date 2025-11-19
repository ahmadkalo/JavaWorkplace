package Schach;

public class Koenig extends Schachfigur {
	public Koenig(Punkt2D position, String farbe, boolean istWeiss) {
		super(position, farbe, istWeiss);
	}

	@Override
	public void step(int n, String r) throws UngueltigeBewegungException {

		int x = position.getX();
		int y = position.getY();

		if (r.equals("oben") && n == 1) {
			y += n;
		} else if (r.equals("unten") && n == 1) {

			y -= n;
		} else if (r.equals("rechts") && n == 1) {

			x += n;

		} else if (r.equals("links") && n == 1) {

			x -= n;
		} else if (r.equals("diagonal oben links") && n == 1) {
			x -= n;
			y += n;
		} else if (r.equals("diagonal unten links") && n == 1) {
			x -= n;
			y -= n;
		} else if (r.equals("diagonal oben rechts") && n == 1) {
			x += n;
			y += n;
		} else if (r.equals("diagonal unten recht") && n == 1) {
			x += n;
			y -= n;
		} else {
			throw new UngueltigeBewegungException("Ungültige Richtung für den König");
		}
		if (x < 0 || x > 7 || y < 0 || y > 7) {
			throw new UngueltigeBewegungException("Bewegung außerhalb des Spielfelds");
		}

		position = new Punkt2D(x, y);

	}
}
