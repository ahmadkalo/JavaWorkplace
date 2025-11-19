package Folge;

import java.util.Iterator;
import java.util.NoSuchElementException;

import DynArray.DynArray;

public class FolgeAlsDynArray<T> implements Folge<T>, Iterable<T> {

	private DynArray<T> dynArray;

	public FolgeAlsDynArray() {
		this.dynArray = new DynArray<T>();
	}

	@Override
	public int size() {
		return dynArray.size();
	}

	@Override
	public boolean isEmpty() {
		return dynArray.isEmpty();
	}

	@Override
	public boolean contains(T e) {
		return dynArray.contains(e);
	}

	@Override
	public T get(int pos) throws IndexOutOfBoundsException {
		return dynArray.get(pos);
	}

	@Override
	public void set(int pos, T e) throws IndexOutOfBoundsException {
		dynArray.set(pos, e);
	}

	@Override
	public int pos(T e) throws NoSuchElementException {
		for (int i = 0; i < dynArray.size(); i++) {
			if (dynArray.get(i).equals(e)) {
				return i;
			}
		}
		throw new NoSuchElementException("Element not found");
	}

	@Override
	public void insert(int pos, T e) throws IndexOutOfBoundsException {
		if (pos < 0 || pos > size()) {
			throw new IndexOutOfBoundsException("Position out of bounds");
		}
		if (pos == size()) {
			addLast(e);
		} else {

			for (int i = size() - 1; i > pos; i--) {
				dynArray.set(i, dynArray.get(i));
			}
			dynArray.set(pos, e);
					
		}
	}

	@Override
	public void addFirst(T e) {
		
		insert(0, e);
		
	}

	@Override
	public void addLast(T e) {
		dynArray.add(e);
	}

	@Override
	public void remove(int pos) throws IndexOutOfBoundsException {
		dynArray.remove(pos);
	}

	@Override
	public void delete(T e) {
		dynArray.delete(e);
	}

	public void show() {
		dynArray.show();
	}

	@Override
	public String toString() {
		return dynArray.toString();
	}

	@Override
	public Iterator<T> iterator() {
		return dynArray.iterator();
	}

	public static void main(String[] args) {
		FolgeAlsDynArray<Integer> folge = new FolgeAlsDynArray<Integer>();

		folge.insert(0, 1);
		folge.insert(1, 2);
		folge.insert(2, 3);
		folge.insert(3, 4);
		folge.insert(4, 5);

		folge.insert(2, 7);

		folge.addFirst(0);
		folge.addLast(9);

		folge.show();

		System.out.println(folge.pos(7));

		String summe = "";
		Iterator<Integer> folgeIter = folge.iterator();
		while (folgeIter.hasNext()) {
			summe += folgeIter.next() + " ";
		}
		System.out.println(summe);

	}
}