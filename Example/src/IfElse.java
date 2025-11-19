
public class IfElse {

	static int min3(int x, int y, int z) {
		if (x < y && x < z) {
			return x;
		} else if (y < x && y < z) {
			return y;

		} else {
			return z;
		}

	}

	public static void main(String[] args) {

		System.out.println("Die kleinste Zahl lautet: " + min3(3, 5, 10));
	}

}
