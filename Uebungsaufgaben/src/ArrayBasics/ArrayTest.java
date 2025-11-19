package ArrayBasics;

public class ArrayTest {
	
	
	public static void main(String[] args) {
		
		int[] test = {1, 2, 3, 4, 5};
		int[] test2 = new int[5];
		
		for (int i = 0; i < test.length; i++) {
			test2[i] = i + 1;
			
			
			System.out.print(test2[i]);
		}
	}

}
