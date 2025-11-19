package EinzelAufgaben;

public class Rang {
	
	public static void main(String[] args) {
		
		int[]  array = {6,-2,4,0,7,6,1,-3};
		
		System.out.println(rank(array,7));
		
	}
	
	public static int rank(int[] array, int pos) {
		if(pos < 0 || pos >= array.length) {
			return -1;
		}
		int rang = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] <= array[pos]) {
			rang++;	
			}
		}
		return rang;
		
		
	}

}
