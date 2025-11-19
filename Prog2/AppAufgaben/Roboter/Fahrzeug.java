package Roboter;
public class Fahrzeug implements Beweglich {

	private IntPunkt2D standort;
	
	public Fahrzeug() {
		this.standort = new IntPunkt2D();
	}

	@Override
	public IntPunkt2D position() {
		return standort;
	}

	@Override
	public void moveTo(IntPunkt2D p) {
		standort.setX(p.x());
		standort.setY(p.y());
	}
	
	
	
}
