package Heap;

import java.util.Iterator;

import DynArray.DynArray;

public class MinHeap<T extends Comparable<T>> implements PrioSchlange<T>, Iterable<T> {
	
    private DynArray<T> heap;

    public MinHeap() {
        heap = new DynArray<>();
    }

    @Override
    public void insert(T element) {
        heap.add(element);
        heapUp(heap.size() - 1);
    }

    @Override
    public T removeMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        T min = heap.get(0);
        T lastElement = heap.get(heap.size() - 1);
        heap.set(0, lastElement);
        heap.remove(heap.size() - 1);
        if (!isEmpty()) {
            heapDown(0);
        }
        return min;
    }

    @Override
    public T getMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap.get(0);
    }

    @Override
    public boolean isEmpty() {
        return heap.size() == 0;
    }

    private void heapUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap.get(index).compareTo(heap.get(parentIndex)) >= 0) {
                break;
            }
            swap(index, parentIndex);
            index = parentIndex;
        }
    }

    private void heapDown(int index) {
        while (2 * index + 1 < heap.size()) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            int smallerChild = leftChild;

            if (rightChild < heap.size() && heap.get(rightChild).compareTo(heap.get(leftChild)) < 0) {
                smallerChild = rightChild;
            }

            if (heap.get(index).compareTo(heap.get(smallerChild)) <= 0) {
                break;
            }

            swap(index, smallerChild);
            index = smallerChild;
        }
    }

    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
    
	@Override
	public Iterator<T> iterator() {
		
		return heap.iterator();
	}

    

    public static void main(String[] args) {
        MinHeap<Integer> minHeap = new MinHeap<>();
        minHeap.insert(10);
        minHeap.insert(4);
        minHeap.insert(15);
        minHeap.insert(20);
        minHeap.insert(0);
        minHeap.insert(5);

        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.removeMin());
        }
        
      //  for( Integer a : minHeap) {
       // 	System.out.println(a);
        //}
    }


}

