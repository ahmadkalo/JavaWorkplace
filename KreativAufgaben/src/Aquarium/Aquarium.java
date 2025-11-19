package Aquarium;

public class Aquarium {

	int tiefe; // tiefe: bezeichnet wie tief das Aquarium ist (ohne Boden "+------------+")
	int breite; // breite: bezeichnet wie breit das Aquarium ist (ohne Wände "|")
	Fisch[] fische; // Array mit allen Fischen im Aquarium
	char[][] aquarium; // visuelle Inhalte des Aquariums

	// Konstruktor
	public Aquarium(int tiefe, int breite) {
		this.tiefe = tiefe; // tiefe bestimmen
		this.breite = breite; // breite bestimmen
		this.fische = new Fisch[0]; // Array initializieren (mit Länge 0, da am Anfang noch keine Fische drin sind)
		this.aquarium = new char[this.tiefe][this.breite]; // visuelle Inhalte des Aquarium haben die selbe tiefe +
															// breite wie das Aquarium
		constructAquarium(); // visuelle Inhalte des Aquarium "mit Wasser einfüllen" (Also am Anfang ist nur Wasser im Aquarium)

	}

	public void constructAquarium() {
		// visuelle Inhalte des Aquariums "mit Wasser einfüllen" ( also mit ' ')
		for (int i = 0; i < tiefe; i++) {
			for (int j = 0; j < breite; j++) {
				aquarium[i][j] = ' ';
			}
		}
	}

	public void drawFish(Fisch f) {
		// zeichnet ein Fisch anhand seiner Koordinaten (tiefe/breite) und symbol (z.B.
		// "<><")
		String symbol;
		if (f.lookingLeft) // bestimmen welche Richtung der Fisch guckt
			symbol = f.leftSymbol;
		else
			symbol = f.rightSymbol;
		// je nach Richtung, Fisch zeichnen
		for (int i = 0; i < symbol.length(); i++) {
			aquarium[f.tiefe][f.breite + i] = symbol.charAt(i);
		}
	}

	public String currentState() {
		// packt die visuellen Inhalte des Aquariums (siehe das Attribute Array aquarium)
		// in einem String ein
		// und fügt Wände('|') und Boden ('+----+') hinzu.
		String result = "";

		for (char[] t : aquarium) {
			result += "|";// add wall
			for (char b : t) {
				result += b;// add Inhalte
			}
			result += "|\n";// add wall
		}

		result += "+";// add ground
		for (int i = 0; i < this.breite; i++) {
			result += "-"; // add ground
		}
		result += "+";// add ground

		return result;
	}

	public void updateAquarium() {
		// bewegt alle Fische einmal hin oder her.
		for (Fisch f : this.fische) {
			removeFish(f); // delete fish
			moveFish(f); // move fish
			drawFish(f); // draw fish again
		}
	}

	public void removeFish(Fisch f) {
		// entfernet ein beliebiger Fisch ausm Attribut Array aquarium
		for (int i = 0; i < f.leftSymbol.length(); i++)
			aquarium[f.tiefe][f.breite + i] = ' ';

	}

	public void addFish(Fisch f) {
		// fügt ein beliebiger Fisch die Array der Fische zu
		if (f.breite + f.leftSymbol.length() > this.breite) // if the length of the fish + his position is bigger than the length of the aquarium
			f.breite = this.breite - f.leftSymbol.length(); // adjust the position of the fish so that there is enough  place to draw him.
		else if (f.breite < 0)
			f.breite = 0;

		// verlängert das Attribut Array fische
		int anzahlFische = this.fische.length; // merke Anzahl Fische
		Fisch[] newFishArray = new Fisch[anzahlFische + 1]; // initializiere neues Array mit Anzahl Fische + 1
		// füge schon vorhandenen Fische neuen Array zu.
		for (int i = 0; i < this.fische.length; i++) {
			newFishArray[i] = this.fische[i];

		}
		// füge neuer Fisch neuen Array zu.
		newFishArray[anzahlFische] = f;
		this.fische = newFishArray; // old array now = new array
		drawFish(f); // draw new fish
	}

	public void moveFish(Fisch f) {
		// bewegt ein beliebiger Fish hin oder her.
		if (f.changeDepth() == 0 && f.tiefe - 1 > 0) // if the fish will change its depth (tiefe). relevant nur für Hai-
														// Kugel- und Schwertfisch.
			f.tiefe--;
		else if (f.changeDepth() == 1 && f.tiefe + 1 != this.tiefe)
			f.tiefe++;

		if (f.lookingLeft) // check ob fisch links or rechts guckt und inkrementiere oder dekrementiere
							// breite.
			f.breite--;
		else
			f.breite++;

		// wenn der Fisch an einer der beiden Wände ist.
		if (!f.lookingLeft && f.breite + f.leftSymbol.length() > this.breite) {
			f.breite = this.breite - f.leftSymbol.length();
			f.changeDirection();
		}
		if (f.lookingLeft && f.breite < 0) {
			f.breite = 0;
			f.changeDirection();
		}
	}

}
