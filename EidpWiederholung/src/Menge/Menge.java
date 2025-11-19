package Menge;

import java.util.NoSuchElementException;

public interface Menge {
	boolean isEmpty();

	int size();

	boolean contains(int n);

	void insert(int n);

	void remove(int n);

	Menge copy();

	int get();

	int get(int pos) throws NoSuchElementException;

	void set(int i, int j) throws NoSuchElementException;
}