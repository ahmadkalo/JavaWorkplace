package EinzelneAufgaben;

import java.util.Iterator;

class Polygon implements Iterable<Punkt2D> {
	private Punkt2D[] punkte;

	public Polygon(Punkt2D[] punkte) {
		this.punkte = punkte;
	}

	public Polygon(int anzahlPunkte) {
		this.punkte = new Punkt2D[anzahlPunkte];

	}

	public Punkt2D[] getPunkte() {
		return punkte;
	}

	public Punkt2D getPunkt(int index) {
		if (index >= 0 && index < punkte.length) {
			return punkte[index];
		} else {
			throw new IndexOutOfBoundsException("Index außerhalb des gültigen Bereichs.");
		}
	}

	public void setPunkt(int index, Punkt2D punkt) {
		if (index >= 0 && index < punkte.length) {
			punkte[index] = punkt;
		} else {
			throw new IndexOutOfBoundsException("Index außerhalb des gültigen Bereichs.");
		}
	}

	public double laenge() {
		double gesamtlaenge = 0.0;
		for (int i = 0; i < punkte.length - 1; i++) {
			Punkt2D punkt1 = punkte[i];
			Punkt2D punkt2 = punkte[i + 1];
			gesamtlaenge += punkt1.distanz(punkt2);
		}

		gesamtlaenge += punkte[punkte.length - 1].distanz(punkte[0]);
		return gesamtlaenge;
	}

	@Override
	public Iterator<Punkt2D> iterator() {

		return new PolygonIterator();
	}

	public class PolygonIterator implements Iterator<Punkt2D> {
		int index;

		PolygonIterator() {
			this.index = 0;

		}

		@Override
		public boolean hasNext() {

			return index < punkte.length;
		}

		@Override
		public Punkt2D next() {

			if (!hasNext()) {
				throw new IndexOutOfBoundsException("Fehler");

			}

			return punkte[index++];
		}

	}

	public static void main(String[] args) {
		Punkt2D[] punkte = { new Punkt2D(-1.58, 3.05), new Punkt2D(-0.69, 1.29), new Punkt2D(2.0, 2.0),
				new Punkt2D(2.52, 3.0), new Punkt2D(4.26, 2.39), new Punkt2D(3.02, -1.39), new Punkt2D(4.5, -2.0)

		};

		Polygon polygon = new Polygon(punkte);
		System.out.println("Länge des Polygons: " + polygon.laenge());

		Polygon polygon1 = new Polygon(3);

		polygon1.setPunkt(0, new Punkt2D(1.3, 2.0));
		polygon1.setPunkt(1, new Punkt2D(1.3, 2.0));
		polygon1.setPunkt(2, new Punkt2D(1.3, 2.0));

		for (Punkt2D punkt : polygon1) {
			System.out.println(punkt);
		}
		
		

	}

}
