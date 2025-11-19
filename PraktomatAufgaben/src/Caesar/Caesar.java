package Caesar;
import java.util.Scanner;

public class Caesar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		char c = scanner.next().charAt(0);

		char ergebnis = (char) (((c + k - 'A') % 26) + 'A');
		System.out.println(ergebnis);
		scanner.close();
	}

}
