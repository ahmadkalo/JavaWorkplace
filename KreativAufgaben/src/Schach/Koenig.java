package Schach;

public class Koenig extends Schachfigur {
	public Koenig(Punkt2D position, String farbe, boolean istWeiss, Schachfigur[][] schachbrett) {
		super(position, farbe, istWeiss, schachbrett);
	}

	@Override
	public void step(int n, String r) throws UngueltigeBewegungException {

		int x = position.getX();
		int y = position.getY();
		int newX = x;
		int newY = y;

		if (r.equalsIgnoreCase("vorne") && n == 1) {
			if (this.istWeiss) {
				newY += n;
			} else {
				newY -= n;
			}

		} else if (r.equalsIgnoreCase("hinten") && n == 1) {
			if (this.istWeiss) {
				newY -= n;
			} else {
				newY += n;
			}

		} else if (r.equalsIgnoreCase("rechts") && n == 1) {

			newX += n;

		} else if (r.equalsIgnoreCase("links") && n == 1) {

			newX -= n;
		} else if (r.equalsIgnoreCase("vorne links") && n == 1) {
			if (this.istWeiss) {
				newX -= n;
				newY += n;
			} else {
				newX -= n;
				newY -= n;
			}

		} else if (r.equalsIgnoreCase("hinten links") && n == 1) {
			if (this.istWeiss) {
				newX -= n;
				newY -= n;
			} else {
				newX -= n;
				newY += n;
			}

		} else if (r.equalsIgnoreCase("vorne rechts") && n == 1) {
			if (this.istWeiss) {

				newX += n;
				newY += n;
			} else {
				newX += n;
				newY -= n;

			}
		} else if (r.equalsIgnoreCase("hinten recht") && n == 1) {
			if (this.istWeiss) {
				newX += n;
				newY -= n;
			} else {
				newX += n;
				newY += n;
			}
			
		} else {
			throw new UngueltigeBewegungException("Ungültige Richtung für den König");
		}
		if (newX < 0 || newY > 7 || newY < 0 || newX > 7) {
			throw new UngueltigeBewegungException("Bewegung außerhalb des Spielfelds");
		}

		schachbrett[y][x] = null;
		schachbrett[newY][newX] = this;
		position = new Punkt2D(newX, newY);

	}
}
