package Messdaten;

public class MessReihe {

	private MessDatum[] daten;
	private MessBereich umdrehungszahl;
	private MessBereich oelTemperatur;
	private MessBereich ladedruck;
	private int size;

	 
	/*Konstruktoren*/
	
	public MessReihe(int n) {
		this.daten = new MessDatum[n];
		this.size = 0;
	}
	
	/*Instanzmetohden*/
	
	public void neueMessung(int u, double t, double d) throws CriticalValue, TooMuchData {
		this.umdrehungszahl.pruefen(u);
		this.oelTemperatur.pruefen(t);
		this.ladedruck.pruefen(d);
		
		if (size >= this.daten.length) {
			throw new TooMuchData();
		}
		this.daten[size] = new MessDatum(u, t, d);
		size++;

		
	}
		double[] ermittleMittleWerte() {
			
			int umdrehungszahlSumme = 0;
			double oelTemperaturSumme = 0;
			double ladedruckSumme = 0;
			for (int i = 0; i < this.daten.length; i++) {
				umdrehungszahlSumme += this.daten[i].getUmdrehungszahl();
				oelTemperaturSumme += this.daten[i].getLadedruck();
				ladedruckSumme += this.daten[i].getLadedruck();
			}
			
			return new double[] {
					umdrehungszahlSumme/this.daten.length, 
					oelTemperaturSumme / this.daten.length,
					ladedruckSumme / this.daten.length
					};
			
	}
		
}
