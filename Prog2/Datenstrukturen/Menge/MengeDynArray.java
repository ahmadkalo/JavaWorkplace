package Menge;

import java.util.Iterator;
import java.util.NoSuchElementException;

import DynArray.DynArray;

public class MengeDynArray<T> implements Menge<T> {

	private DynArray<T> array;

	public MengeDynArray() {
		this.array = new DynArray<>();
	}

	@Override
	public int size() {
		return array.size();
	}

	@Override
	public boolean isEmpty() {
		return array.isEmpty();
	}

	@Override
	public T get() throws NoSuchElementException {
		return array.get(0);
	}

	@Override
	public void insert(T e) {
		array.add(e);
	}

	@Override
	public void delete(T e) {
		array.remove(0);
	}

	@Override
	public boolean contains(T e) {
		return array.contains(e);
	}
	@Override
	public void show() {
		array.show();
	}

	@Override
	public Iterator<T> iterator() {
		
		return array.iterator();
	}

}
