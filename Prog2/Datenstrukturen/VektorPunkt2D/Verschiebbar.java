package VektorPunkt2D;

public interface Verschiebbar {
	
	    // Methode zur Rückgabe der Position
	Punkt2D position();

	    // Methode zum Verschieben zu einer neuen Position
	    void moveTo(Punkt2D newPosition);
	}

