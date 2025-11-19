package ArraySort;

import java.util.Random;

public class ArraySort {

	public static void main(String[] args) {

		int arrayFest[] = { 25, 16, 18, 29, 2, 15, 10, 23, 11, 32, 24 };
		int[] arrayRan = new int[10];

		randomizeArray(arrayRan);

		insertionSort(arrayFest);
		zeigeArray(arrayFest);

		selectionSort(arrayRan);
		zeigeArray(arrayRan);

		bubbleSort(arrayRan);
		zeigeArray(arrayRan);

		mergSort(arrayRan);
		zeigeArray(arrayRan);

		quickSort(arrayRan, 0, arrayRan.length - 1);
		zeigeArray(arrayRan);
		
		heapSort(arrayRan);
		zeigeArray(arrayRan);

	}

	public static void insertionSort(int[] array) {

		for (int i = 1; i < array.length; i++) {
			int currentValue = array[i];
			int previous = i - 1;

			while (previous >= 0 && array[previous] > currentValue) {
				array[previous + 1] = array[previous];
				previous--;
			}
			array[previous + 1] = currentValue;

		}
	}

	public static void selectionSort(int[] array) {



		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {

				if (array[j] < array[min]) {
					min = j;
				}

			}
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;

		}

	}

	public static void bubbleSort(int[] array) {
		boolean wechsel;
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			wechsel = false;
			for (int j = 0; j < n - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					wechsel = true;

				}

			}
			if (wechsel == false)
				break;
		}
	}

	public static void mergSort(int[] array) {
		int arrayLength = array.length;

		if (arrayLength < 2) {
			return;
		}
		int mittelIndex = arrayLength / 2;
		int[] linkeHaelfte = new int[mittelIndex];
		int[] rechteHaelfte = new int[arrayLength - mittelIndex];

		for (int i = 0; i < mittelIndex; i++) {
			linkeHaelfte[i] = array[i];
		}

		for (int i = mittelIndex; i < arrayLength; i++) {
			rechteHaelfte[i - mittelIndex] = array[i];
		}

		mergSort(linkeHaelfte);
		mergSort(rechteHaelfte);

		merge(array, linkeHaelfte, rechteHaelfte);

	}

	public static void merge(int[] array, int[] linkeHaelfte, int[] rechteHaelfte) {

		int linksLength = linkeHaelfte.length;
		int rechtsLength = rechteHaelfte.length;

		int i = 0, j = 0;
		int k = 0;

		while (i < linksLength && j < rechtsLength) {
			if (linkeHaelfte[i] <= rechteHaelfte[j]) {
				array[k] = linkeHaelfte[i];
				i++;
			} else {
				array[k] = rechteHaelfte[j];
				j++;
			}
			k++;
		}

		while (i < linksLength) {
			array[k] = linkeHaelfte[i];
			i++;
			k++;
		}

		while (j < rechtsLength) {
			array[k] = rechteHaelfte[j];
			j++;
			k++;
		}

	}

	public static void quickSort(int[] array, int lowIndex, int highIndex) {

		if (lowIndex >= highIndex) {
			return;
		}

		int pivot = array[highIndex];
		int leftPointer = lowIndex;
		int rightPointer = highIndex;

		while (leftPointer < rightPointer) {

			while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}
			while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}
			swap(array, leftPointer, rightPointer);
		}

		swap(array, leftPointer, highIndex);

		quickSort(array, lowIndex, leftPointer - 1);
		quickSort(array, leftPointer + 1, highIndex);

	}

	private static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	
	
	public static void heapSort(int[] arr) {
	    int n = arr.length;

	    // Schritt 1: Erstelle einen Max-Heap
	    for (int i = n / 2 - 1; i >= 0; i--)
	        heapify(arr, n, i);

	    // Schritt 2: Sortiere den Heap
	    for (int i = n - 1; i >= 0; i--) {
	        // Bewege die aktuelle Wurzel ans Ende
	        int temp = arr[0];
	        arr[0] = arr[i];
	        arr[i] = temp;

	        // Wende heapify auf den verkleinerten Heap an
	        heapify(arr, i, 0);
	    }
	}

	// Funktion, um einen Teilbaum zu einem Knoten i zu heapifyen
	public static void heapify(int[] arr, int n, int i) {
	    int largest = i; // Initialisiere largest als Wurzel
	    int left = 2 * i + 1;
	    int right = 2 * i + 2;

	    // Überprüfe, ob das linke Kind größer als die Wurzel ist
	    if (left < n && arr[left] > arr[largest])
	        largest = left;

	    // Überprüfe, ob das rechte Kind größer als largest ist
	    if (right < n && arr[right] > arr[largest])
	        largest = right;

	    // Wenn largest nicht die Wurzel ist
	    if (largest != i) {
	        // Tausche arr[i] und arr[largest]
	        int temp = arr[i];
	        arr[i] = arr[largest];
	        arr[largest] = temp;

	        // Rekursiv heapify den betroffenen Teilbaum
	        heapify(arr, n, largest);
	    }
	}

	    
	    
	public static void zeigeArray(int[] array) {
		System.out.print("{");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);

			if (i < array.length - 1) {
				System.out.print(", ");
			} else {
				System.out.print("}");
			}
		}

		System.out.println();
	}

	private static void randomizeArray(int[] array) {
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);

		}
	}

}
