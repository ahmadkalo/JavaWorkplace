package ArrayBasics;

public class ArrayMaximum {

	public static void main(String[] args) {
		
		int[] zahlenmenge = {3,45,2,9,8};
		
		int maximum = 0;
		
		for(int zahl : zahlenmenge) {
			if(zahl > maximum) {
				maximum = zahl;
				
			}
		}
	
		System.out.println("Maximum: " + maximum);

	}

}
