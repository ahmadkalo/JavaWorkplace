package Heap;

interface PrioSchlange<T extends Comparable<T>> {
	void insert(T element);

	T removeMin();

	T getMin();

	boolean isEmpty();
}
