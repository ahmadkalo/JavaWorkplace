package Schach;

public class Bauer extends Schachfigur {

	public Bauer(Punkt2D postion, boolean istWeiß) {
		super(postion, istWeiß);

	}

	@Override
	public void step(int n, String r) throws UngueltigeBewegung {

		int x = postion.getX();
		int y = postion.getY();

		if (r.equalsIgnoreCase("vorne") && n == 1) {
			if (istWeiß) {
				y += n;

			} else {
				y -= n;
			}

		} else {
			throw new UngueltigeBewegung("Ungültige Bewegung");

		}
		if (x < 0 || x > 7 || y < 0 || y > 7) {
			throw new UngueltigeBewegung("Bewegung außerhalb der Arena");
		}

		postion = new Punkt2D(x, y);

	}

	

}
