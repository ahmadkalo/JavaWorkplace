package Gewaesser;

public class Fluss extends Gewaesser {
	
	public Fluss(Gewaesser muendetIn) {
		super(muendetIn);
	}

	public double tiefe() {
		return Math.random() * (200 + 1); // [0,200]
	}
}
