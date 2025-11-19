package Roboter;
public class Roboter implements Beweglich {

	private IntPunkt2D pos;	// aktuelle Position
	private int richtung; 	// aktuelle Blickrichtung
							// 0: Nord (oben)
							// 1: Ost (rechts)
							// 2: Sued (unten)
							// 3: West (links)
	
	public Roboter(IntPunkt2D start, int r) throws IllegalArgumentException {
		if (r < 0)
			throw new IllegalArgumentException("negative Richtung nicht erlaubt");
		this.pos = start;
		this.richtung = r % 4;
	}
	
	public Roboter(IntPunkt2D start) {
		this(start, 0);
	}
	
	public Roboter() {
		this(new IntPunkt2D());
	}
	
	public int richtung() {
		return this.richtung;
	}
	
	public void step() {
		// macht einen Schritt in aktuelle Blickrichtung
		switch (richtung) {
		case 0: pos.setY(pos.y()+1); break;
		case 1: pos.setX(pos.x()+1); break;
		case 2: pos.setY(pos.y()-1); break;
		case 3: pos.setX(pos.x()-1); break;
		}
	}
	
	public void turn(int richtung) throws IllegalArgumentException {
		// dreht sich in die angegebene Richtung
		if (richtung < 0)
			throw new IllegalArgumentException("negative Richtung nicht erlaubt");
		this.richtung = richtung % 4;
	}

	@Override
	public IntPunkt2D position() {
		return this.pos;
	}

	@Override
	public void moveTo(IntPunkt2D p) {
		double dx = p.x() - pos.x();
		double dy = p.y() - pos.y();
		if (dx < 0) {
			turn(3);
			while(dx < 0) {
				step();
				dx++;
			}
		}
		if(dx > 0) {
			turn(1);
			while(dx > 0) {
				step();
				dx--;
			}
		}
		if (dy < 0) {
			turn(2);
			while(dx < 0) {
				step();
				dy++;
			}
		}
		if(dy > 0) {
			turn(0);
			while(dy > 0) {
				step();
				dy--;
			}
		}
	}
	
	@Override
	public String toString() {
		String p = this.pos.toString();
		String r = "";
		switch(richtung) {
		case 0: r = "N"; break;
		case 1: r = "O"; break;
		case 2: r = "S"; break;
		case 3: r = "W";
		}
		return "Pos: " + p + " \t Blickrichtung: " + r;
	}
	
}
