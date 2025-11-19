package EinzelneAufgaben;

public class Roboter {

	int x;
	int y;
	int akkuLadung;
	int blickRichtung;

	Roboter() {
		this.x = 0;
		this.y = 0;
		this.blickRichtung = 0;
		this.akkuLadung = 50;
		// this(0, 0, 50, 0);
	}

	public Roboter(int x, int y, int akkuLadung, int blickRichtung) {
		this.x = x;
		this.y = y;
		this.akkuLadung = akkuLadung;
		this.blickRichtung = blickRichtung;
	}

	public void step() {
		step(1);
	}

	public void step(int n) {
		if (blickRichtung == 0) {
			y += n;
		} else if (blickRichtung == 1) {
			x += n;
		} else if (blickRichtung == 2) {
			y -= n;
		} else if (blickRichtung == 3) {
			x -= n;
		}
		akkuLadung -= n;
	}

	public void turn() {
		blickRichtung = (blickRichtung + 1) % 4;
	}

	void spirale(int nmax) {
		int steps = 1;
		int zaehler = 0;

		while (akkuLadung >= steps) {
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < steps; j++) {
					step();
					zaehler++;
					if (zaehler == nmax) {
						return;
					}
				}

				turn();
			}
			steps++;
		}

	}

}
