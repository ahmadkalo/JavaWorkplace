package ArrayBasics;

import java.util.Arrays;

public class GeradeZahlNull {

	
	public static void main(String[] args) {
		
		int [] liste = {1,2,5,7,18,11,12,15};
		
		for(int i = 0; i < liste.length; i++) {
			if (liste[i] % 2 != 1) {
				liste[i] = 0;
			}
		} System.out.println(Arrays.toString(liste));
	}
		
		
	}
