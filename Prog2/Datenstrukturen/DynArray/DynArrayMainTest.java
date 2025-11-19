package DynArray;

public class DynArrayMainTest {

	public static void main(String[] args) {

		DynArray<Integer> array1 = new DynArray<Integer>();
	
		array1.add(1);
		
		array1.add(2);
		array1.add(3);
		array1.add(4);
		array1.add(5);
		array1.add(6);



		array1.remove();
		array1.remove();
		array1.remove(3);
		array1.set(2, 8);
		array1.reverse();

		array1.show();

		System.out.println("The Element you want: " + array1.get(2));

		System.out.println("Emptiness: " + array1.isEmpty());

		System.out.println("Size: " + array1.size());

		System.out.println();

		DynArray<String> array2 = new DynArray<String>();
		array2.add("Ahmed");
		array2.add("Heva");
		array2.add("Lava");
		array2.add("Delyar");

		array2.set(1, "Nahla");

		array2.show();

		System.out.println("The Element you want: " + array2.get(2));

		System.out.println("Emptiness: " + array2.isEmpty());

		System.out.println("Size: " + array2.size());

	}

}
