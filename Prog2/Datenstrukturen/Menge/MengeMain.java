package Menge;

public class MengeMain {

	public static void main(String[] args) {

		MengeLimited<Integer> test = new MengeLimited<>();
		MengeLimited<Integer> test2 = new MengeLimited<>();
		
		test.insert(1);
		test.insert(2);
		test.insert(3);
		
		test2.insert(4);
		test2.insert(5);
		test2.insert(6);
		
		MengeUtil.merge(test, test2);
		
		System.out.println("Die erste Menge " + test);
		System.out.println("Die zweite Menge " + test2);
		
	

	}
}