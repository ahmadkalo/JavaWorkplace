package Gewaesser;

public class Meer extends Gewaesser {
	
	public Meer(Gewaesser muendetIn) {
		super(null);
	}

	public double tiefe() { // [100, 10.000]
		return  100 + Math.random() * (10000 - 100 + 1);
	}
}