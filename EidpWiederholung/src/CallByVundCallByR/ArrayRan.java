package CallByVundCallByR;

import java.util.Random;

public class ArrayRan {
	
	static Random r = new Random();
	
	public static void fillRandom (int [] a, int min, int max) {
		for (int i = 0; i < a.length; i++) {
			System.out.print( a[i] = r.nextInt(max - min) + min);
		 
		  
			
		}
		
		
	}
	
	public static void main(String[] args) {
		int []a = {1,2,3,4,5,7,8,9};
		fillRandom(a,1,9);
		
	
	}
	

}
