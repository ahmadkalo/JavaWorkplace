package PostbotenIterator;

import java.util.Iterator;

public class PostboteIterator<T> implements Iterator<T> {
	private T[] array;
	private int ungeradeIndex;
	private int geradeIndex;
	private boolean ungeradePhase;

	public PostboteIterator(T[] array) {
		this.array = array;
		ungeradeIndex = 1;
		geradeIndex = array.length - 1;
		if ((array.length - 1) % 2 != 0) {
			geradeIndex = array.length - 2; // Sonderfall
		} 
		ungeradePhase = true;
	}

	@Override
	public boolean hasNext() {

		return ungeradeIndex < array.length || geradeIndex >= 1;
	}

	// Gibt das nächste Element im Array zurück
	@Override
	public T next() {

		T element; // Das Element, das zurückgegeben wird

		if (ungeradePhase) {
			element = array[ungeradeIndex];
			ungeradeIndex += 2;

			if (ungeradeIndex >= array.length) {
				ungeradePhase = false;

			}
		} else {

			element = array[geradeIndex];
			geradeIndex -= 2;

		}

		return element; // Das zurückgegebene Element wird zurückgegeben
	}

}
