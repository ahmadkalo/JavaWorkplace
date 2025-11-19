package CallByVundCallByR;

public class ParameterTests {

	public static void main(String[] args) {
		int x = 5;
		int y = 7;
		swap(x,y);		
		testSwapArray();
		
		int[] xA = {1,2,3,4};
		int[] yA = {5,6,7,8};
		swapFail(xA,yA);
		
		
		
	}

	public static void swap(int x, int y) {
		// tut's nicht
		System.out.println("in swap Vor dem Tausch:");
		System.out.println("x = " + x + "\ty = " + y);
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println("in swap Nach dem Tausch:");
		System.out.println("x = " + x + "\ty = " + y);
	}

	public static void swapFail(int[] x, int[] y) {
		// tut's nicht
		int[] tmp = x;
		x = y;
		y = tmp;
		System.out.println("swapFail:");
		zeigeArray(x);
		zeigeArray(y);
	}
	
	public static void zeigeArray(int[] arr) {
		for(int i = 0; i < arr.length; i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void swapArray(int[] x, int[] y) {
		int tmp = x[0];
		x[0] = y[0];
		y[0] = tmp;
	}

	public static void testSwapFail() {
		int[] A = { 5 };
		int[] B = { 7 };
		System.out.println("Vor dem Tausch:");
		System.out.println("A: " + A[0] + "\tB: " + B[0]);
		swapFail(A, B);
		System.out.println("Nach dem Tausch:");
		System.out.println("A: " + A[0] + "\tB: " + B[0]);
	}

	public static void testSwapArray() {
		int[] A = { 5 };
		int[] B = { 7 };
		System.out.println("Vor dem Tausch:");
		System.out.println("A: " + A[0] + "\tB: " + B[0]);
		swapArray(A, B);
		System.out.println("Nach dem Tausch:");
		System.out.println("A: " + A[0] + "\tB: " + B[0]);
	}

	public static void testSwap() {
		int x = 5;
		int y = 7;
		System.out.println("in test Vor dem Tausch:");
		System.out.println("x = " + x + "\ty = " + y);
		swap(x, y);
		System.out.println("in test Nach dem Tausch:");
		System.out.println("x = " + x + "\ty = " + y);
	}

	public static double mittelwert(double x, double y) {
		double sum = x + y;
		return sum / 2.0;
	}

	public static void testMW() {
		double a = 5.0;
		double b = 2.0;
		double mw = mittelwert(a, b);
		System.out.println("a = " + a + "\tb = " + b);
		System.out.println("Mittelwert: " + mw);
	}

}
