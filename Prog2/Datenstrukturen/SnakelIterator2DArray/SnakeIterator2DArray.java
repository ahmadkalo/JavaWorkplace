package SnakelIterator2DArray;

import java.util.Iterator;

public class SnakeIterator2DArray<T> implements Iterable<T> {
	private T[][] array;


	public SnakeIterator2DArray(T[][] array) {
		this.array = array;
	

	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new Sanke2DIterator();
	}

	public class Sanke2DIterator implements Iterator<T> {
		private int zeilenIndex;
		private int spaltenIndex;
		
		
		public Sanke2DIterator() {
			this.zeilenIndex = 0;
			this.spaltenIndex = 0;
		}
		
		@Override
		public boolean hasNext() {
			return zeilenIndex >= 0 && zeilenIndex < array.length && spaltenIndex >= 0
					&& spaltenIndex < array[zeilenIndex].length;
		}

		@Override
		public T next() {
			T wert = array[zeilenIndex][spaltenIndex];

			
			if (zeilenIndex % 2 == 0) { // Wenn der Zeilenindex gerade ist
				spaltenIndex++; // Gehe von vorne nach hinten
			} else { // Wenn der Zeilenindex ungerade ist
				spaltenIndex--; // Gehe von hinten nach vorne
			}

			if (zeilenIndex + 1 < array.length && (spaltenIndex >= array[zeilenIndex].length || spaltenIndex < 0)) {
				zeilenIndex++;
				if (zeilenIndex % 2 == 0) {
					spaltenIndex = 0;
				} else {
					spaltenIndex = array[zeilenIndex].length - 1;

				}
			}

			return wert;

		}

	}

	public static void main(String[] args) {

		Integer[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 1, 2, 3 }, { 1, 3, 4 } };

		testIterator2DArray(arr); // Teste den Iterator für das 2D-Array

	}

	// Eine Methode zum Testen des Iterators für das 2D-Array
	public static void testIterator2DArray(Integer[][] arr) {
		Iterable<Integer> iterator = new SnakeIterator2DArray<>(arr); // Erstelle einen Iterator für das 2D-Array
		System.out.println("Iterator2DArray"); // Gib eine Nachricht aus

		 for (Integer value : iterator) {
	            System.out.print(value + " "); // Gib die Werte des 2D-Arrays durch das Iterable aus
	        }
		System.out.println();
	}

}
