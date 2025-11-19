package Rekrusion;

public class RekrusivFakultaet {
	
	public static int rechneFakultaet (int a) {
		
		if (a <= 1) {
			return 1;
		}
		else {
			return a * rechneFakultaet (a-1);  
		}
	}
	
	public static void main (String[] args) {
		
		System.out.println("4! = " + rechneFakultaet(4));
	}
}



