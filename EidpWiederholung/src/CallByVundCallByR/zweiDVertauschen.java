package CallByVundCallByR;

public class zweiDVertauschen {

	public static void tausche(double[][] m, int n, int k) {
		// Prüfen, ob die Zeilenindizes innerhalb des zulässigen Bereichs liegen
		if (m == null || n < 0 || n >= m.length || k < 0 || k >= m.length) {
			return; // Nichts tun, wenn eine Angabe außerhalb des zulässigen Bereichs liegt
		}

		// Zeilen n und k tauschen
		double[] temp = m[n];
		m[n] = m[k];
		m[k] = temp;
	}
	
	
	public static void zeigeMatrix(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+ " ");

			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		// Array gilt als Objekt
		double[][] matrix = {{ 1.0, 2.0, 3.0 },
							 { 4.0, 5.0, 6.0 },
							 { 7.0, 8.0, 9.0 }};

		
		System.out.println("Vor dem Tauschen:");
		zeigeMatrix(matrix);

		
		tausche(matrix, 0, 2);

		
		System.out.println("Nach dem Tauschen:");
		zeigeMatrix(matrix);
	}


}