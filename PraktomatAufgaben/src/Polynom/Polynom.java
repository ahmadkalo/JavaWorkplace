package Polynom;

public class Polynom {
	
	double[] koeffizienten;
	static int anzahlPolynome = 0;

	public Polynom(double[] koeffizienten) {   
		if (koeffizienten.length == 0)
			System.out.println("Fehler: leeres Koeffizientenfeld");
		else {
			this.koeffizienten = koeffizienten;
			anzahlPolynome++;
		}
		
	}
	
	public String toString() {
		if (this.koeffizienten == null)
			return "Fehler: Dieses Polynom hat keine Koeffizienten";

		String result = "";
		
		for (int i = this.koeffizienten.length - 1; i >= 0 ; i--) {
			if (this.koeffizienten[i] != 0) {
				result += this.koeffizienten[i] + "*" + "x^" + i;
				if (i != 0)
					result += " + ";
			}
		}
		 
		if (result.length() == 0)
			return "0";
		return result;
	}

	public double auswerten(double x) {
		if (this.koeffizienten == null) {
			System.out.println("Fehler: Dieses Polynom hat keine Koeffizienten");
			return 0.0;
		}
		double result = 0.0;
		
		for (int i = this.koeffizienten.length - 1; i >= 0 ; i--) {
			result += this.koeffizienten[i] * Math.pow(x, i);
			
		}
		
		return result;
	}
	
	public static int getAnzahl() {
		return anzahlPolynome;
	}
}
