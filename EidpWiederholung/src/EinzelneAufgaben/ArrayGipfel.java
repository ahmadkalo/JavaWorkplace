package EinzelneAufgaben;

public class ArrayGipfel {

	public static void findeGipfeln(int[] gipfel) {

		 int gipfelCount = 0;
		for (int i = 1; i < gipfel.length - 1; i++) {
			if (gipfel[i - 1] < gipfel[i] && gipfel[i + 1] < gipfel[i]) {
				  if (gipfelCount > 0) {
	                    System.out.print(", ");
	                }
	                System.out.print(gipfel[i]);
	                gipfelCount++;
	            }

			}
		}

	

	public static void main(String[] args) {

		int[] gipfel = { 4, 6, 18, 1, 8, 5, 12, 2, 3, 7, 1, 5, 3, 1, 0, 11, 5, 16 };

		findeGipfeln(gipfel);
	}

}
