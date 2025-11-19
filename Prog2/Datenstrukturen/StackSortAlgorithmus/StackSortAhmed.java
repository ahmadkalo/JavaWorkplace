package StackSortAlgorithmus;

import java.util.Stack;

public class StackSortAhmed {

	public static void stackSort(int[] arr) {

		insertionSort(arr);

		Stack<Integer> stackKlein = new Stack<>();
		Stack<Integer> stackGross = new Stack<>();

		int kleinesElement = 0;
		int großesElement = 0;

		for (int i = 0; i < arr.length / 2; i++) {
			kleinesElement = arr[i];
			stackKlein.push(kleinesElement);
		}
		for (int j = arr.length - 1; j > (arr.length / 2) - 1; j--) {
			großesElement = arr[j];
			stackGross.push(großesElement);

		}

	}

	public static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int currentValue = arr[i];
			int previous = i - 1;

			while (previous >= 0 && arr[previous] > currentValue) {
				arr[previous + 1] = arr[previous];
				previous--;
			}
			arr[previous + 1] = currentValue;

		}

	}

	public static void main(String[] args) {

		int[] zahlen1 = { 2, 3, 1, 5, 7, 8, 10, 9, 4, 6 };

		stackSort(zahlen1);

	}

}
