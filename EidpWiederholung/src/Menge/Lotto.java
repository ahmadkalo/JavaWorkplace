package Menge;

import java.util.NoSuchElementException;

public class Lotto implements Menge {

	private int[] lottoZahlen;
	private int size;

	public Lotto() {
		lottoZahlen = new int[6];
		size = 0;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {

		return size;
	}

	@Override
	public boolean contains(int n) {
		for (int i = 0; i < size; i++) {
			if (lottoZahlen[i] == n) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void insert(int n) {
		if (size < 6 && !contains(n)) {
			lottoZahlen[size++] = n;
		}
	}

	@Override
	public void remove(int n) throws IndexOutOfBoundsException {
		if (n < 0 || n > size)
			throw new IndexOutOfBoundsException();
		for (int i = n; i < size - 1; i++) {
			lottoZahlen[i] = lottoZahlen[i + 1];
		}
		
		size--;
	}

	@Override
	public Menge copy() {
		Lotto copy = new Lotto();
		for (int i = 0; i < size; i++) {
			copy.insert(lottoZahlen[i]);
		}
		return copy;
	}

	@Override
	public int get() {
		if (size > 0) {
			return lottoZahlen[size - 1];
		}
		throw new NoSuchElementException("Menge ist leer");
	}

	@Override
	public int get(int pos) {
		if (size > 0) {
			return lottoZahlen[pos];
		}
		throw new NoSuchElementException("Menge ist leer");
	}
	
	 @Override
	    public void set(int pos, int n) {
	        if (pos < 0 || pos >= size) {
	            throw new NoSuchElementException("Ungültige Position: " + pos);
	        }
	        lottoZahlen[pos] = n;
	    }

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < size; i++)
			s = s + lottoZahlen[i] + " ";
		return s;

	}

}
