package Messdaten;

public class MessBereich {
	
	
	/* Instanzvariablen*/

	private double von;
	private double bis;
	private double abHierKritisch;
	


	void pruefen(double wert) throws CriticalValue {
		if (wert >= von && wert <= bis) {
			if ( wert >= abHierKritisch) {
				throw new CriticalValue();
		}
			
		} else {
			throw new IllegalValue();
		}
	} 
		
}
