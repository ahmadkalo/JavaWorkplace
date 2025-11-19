package StackSortAlgorithmus;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class StackSortAlgorithm {

	// Pop nimmt das oberste Element aus dem Stack und entfernt es aus dem Stack
	// Peek nimmt das oberste Element aus dem Stack ohne es zu entfernen
	// push fügt ein Element oben auf dem Stack hinzu

	public static void stackSort(int[] arr) {

		Stack<Integer> stack2 = new Stack<>();
		Stack<Integer> stack1 = new Stack<>();

		Iterator<Integer> arrayIterator = Arrays.stream(arr).iterator();

		while (arrayIterator.hasNext()) {
			stack2.push(arrayIterator.next());
		}

		while (!stack2.isEmpty()) {
			int wert = stack2.pop();
			while (!stack1.isEmpty() && stack1.peek() > wert) {
				stack2.push(stack1.pop());

			}
			stack1.push(wert);

		}

		for (int i = 0; i < arr.length / 2; i++) {
			arr[i] = stack2.push(stack1.pop());

		}

		System.out.println("Stack 1 aufsteigend " + stack1);
		System.out.println("Stack 2 absteigend " + stack2);

		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}

		int[] sortedArray = new int[arr.length];
		int index = 0;

		while (!stack2.isEmpty()) {
			sortedArray[index++] = stack2.pop();
		}
		System.out.println(Arrays.toString(sortedArray));

	}

	public static void main(String[] args) {

		int[] zahlen1 = { 2, 3, 1, 5, 7, 8, 10, 9, 4, 6 };

		stackSort(zahlen1);

	}
}
