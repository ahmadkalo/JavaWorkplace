package ArrayBasics;
import java.util.Arrays;

public class ArrayUngerade {
	
	public static void main(String[] args) {
		
		int n = 8;
		int [] liste = new int[n];
		
		for (int i = 0; i < liste.length; i++) {
			liste[i] = (2 * i) + 1;
			
			
		} System.out.println(Arrays.toString(liste));
	}

}                                                                               
