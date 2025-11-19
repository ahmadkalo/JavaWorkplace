package ArrayBasics;

import java.util.Arrays;

public class ArrayLetztesInErstes {
	
	public static void main(String[] args) {
		
		int [] liste = {1,3,5,0,9,11,13,15};
		
		for(int i = liste.length - 1; i > 1; i--) {
			
			liste [i - 1] = liste[i];
			
			
			
		} System.out.println(Arrays.toString(liste));
		
			
		
	}

}
