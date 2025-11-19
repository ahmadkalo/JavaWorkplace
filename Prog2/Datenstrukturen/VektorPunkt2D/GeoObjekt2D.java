package VektorPunkt2D;

public abstract class GeoObjekt2D extends GeoObjekt implements Skalierbar {

	/* Konstruktoren */

	public GeoObjekt2D(String farbe) {
		super(farbe);
	}

	/* Instanzmethoden */

	public abstract double umfang();

	public abstract double flaeche();

}
