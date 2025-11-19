package Gewaesser;

public abstract class Gewaesser {
	
	private Gewaesser muendetIn;

	public Gewaesser(Gewaesser muendetIn) {
		this.muendetIn = muendetIn;
	}

	public Gewaesser getMuendetIn() {
		return muendetIn;
	}

	public abstract double tiefe();
}
