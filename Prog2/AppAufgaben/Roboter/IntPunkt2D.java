package Roboter;

public class IntPunkt2D {
	
	private int x;
	private int y;
	
	public IntPunkt2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public IntPunkt2D() {
		this(0, 0);
	}
	
	public int x() {
		return this.x;
	}
	
	public int y() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		String s = "(" + this.x + ", " + this.y + ")";
		return s;
	}
	
	// überprüfen, ob zwei IntPunkt2D-Objekte gleich sind, indem ihre x- und y-Koordinaten verglichen werden
	@Override
	public boolean equals(Object other) {
		IntPunkt2D o = (IntPunkt2D) other;
		return (this.x == o.x && this.y == o.y);
	}

}
