package Naz.Schach;



public class Turm extends Schachfigur {

	public Turm(Punkt2D position, boolean istWeiss) {
		super(position, istWeiss);

	}

	@Override
	public void step(int n, String r) throws UngueltigeBewegungException {

		int x = position.getX();
		int y = position.getY();

		if (r.equals("oben")) {
			y += n;
		} else if (r.equals("unten")) {

			y -= n;
		} else if (r.equals("rechts")) {

			x += n;

		} else if (r.equals("links")) {

			x -= n;
		} else {
			throw new UngueltigeBewegungException("Ungültige Richtung für den Turm");
		}
		if (x < 0 || x > 7 || y < 0 || y > 7) {
			throw new UngueltigeBewegungException("Bewegung außerhalb des Spielfelds");
		}

		position = new Punkt2D(x, y);

	}

}
