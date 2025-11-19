

public class ArrayPuffer {

	int[] array;

	public ArrayPuffer() {
		this.array = new int[4];
	}

	public void add(int element) {

		int i = 0;
		array[i] = element;
		i++;
	}

	@Override
	public String toString() {
		return this.array + " ";
	}

	public static void main(String[] args) {

		ArrayPuffer ahmed = new ArrayPuffer();

		ahmed.add(1);
		ahmed.add(2);

		System.out.println(ahmed);

	}

}
