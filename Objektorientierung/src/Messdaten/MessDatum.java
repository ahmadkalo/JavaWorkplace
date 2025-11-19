package Messdaten;

public class MessDatum {
	
	/* Instanzvariablen*/
	
	private int umdrehungszahl;
	private double oelTemperatur;
	private double ladedruck;
	
	
	/*Konstruktor*/
	public MessDatum(int umdrehungszahl, double oelTemperatur, double ladedruck) {
		
		this.umdrehungszahl = umdrehungszahl;
		this.oelTemperatur = oelTemperatur;
		this.ladedruck = ladedruck;
	}


	public int getUmdrehungszahl() {
		return umdrehungszahl;
	}


	public double getOelTemperatur() {
		return oelTemperatur;
	}


	public double getLadedruck() {
		return ladedruck;
	}
	
	
	
	

}
