
public class EulerscheZahl {
	
	public static double berechneE(double epsilon) {
		
		double e = 1.0;
		double summand = 1.0;
		int k = 1;
		int fakultaet = 1;
		
		while(summand >= epsilon && k <= 1000000) {
			fakultaet = fakultaet*k;
			
			summand = 1.0/ fakultaet;
			e = e + summand;
			k++;
		}
		
		return e;
		
	}
	
	public static void main(String[] args) {
		
		double epsilon = 0.001;
		
		
		
		System.out.println(berechneE(epsilon));
		
		
	}

	
	
}
