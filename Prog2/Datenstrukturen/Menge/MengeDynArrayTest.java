package Menge;

public class MengeDynArrayTest {


		public static void main(String[] args) {

			MengeDynArray<Integer> array1 = new MengeDynArray<>();

			array1.insert(1);
			array1.insert(2);
			array1.insert(3);
			array1.insert(4);
			array1.insert(5);
			array1.insert(6);

			

		
			array1.delete(3);
			
			array1.show();
			

			

			System.out.println("The Element you want: " + array1.get());

			System.out.println("Emptiness: " + array1.isEmpty());

			System.out.println("Size: " + array1.size());


		

	}
		
}


