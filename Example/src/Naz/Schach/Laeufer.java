package Naz.Schach;



public class Laeufer extends Schachfigur {

	public Laeufer(Punkt2D position, boolean istWeiss) {
		super(position, istWeiss);

	}

	@Override
	public void step(int n, String r) throws UngueltigeBewegungException {
		int x = position.getX();
		int y = position.getY();

		if (r.equals("diagonal oben links")) {
			x -= n;
			y += n;
		} else if (r.equals("diagonal unten links")) {
			x -= n;
			y -= n;
		} else if (r.equals("diagonal oben rechts")) {
			x += n;
			y += n;
		} else if (r.equals("diagonal unten recht")) {
			x += n;
			y -= n;
		} else {
			throw new UngueltigeBewegungException("Ungültige Richtung für den Läufer");
		}
		if (x < 0 || x > 7 || y < 0 || y > 7) {
			throw new UngueltigeBewegungException("Bewegung außerhalb des Spielfelds");
		}

		position = new Punkt2D(x, y);

	}

}
