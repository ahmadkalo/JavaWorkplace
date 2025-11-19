package Rekrusion;

public class SchleifeFakultaet {
	
	public static int rechneFakultaet (int a) {
		
		int result = 1;
		
		for (int i = 1; i <= a; i++) {
			result *= i; 
			
			
		}
		return result;  
	}
	public static void main (String[] args) {
		
		System.out.println("3! = " + rechneFakultaet(3));
	}
}
