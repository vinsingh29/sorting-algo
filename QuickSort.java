package sorting;

import java.util.Arrays;

public class QuickSort {

	public static int partition(int[] arr, int start, int end) {

		int pivot = arr[end];
		int pivotIndex = start;

		for (int i = start; i <= end - 1; i++) {
			if (arr[i] <= pivot) {
				int temp = arr[i];
				arr[i] = arr[pivotIndex];
				arr[pivotIndex] = temp;
				pivotIndex++;

			}
		}

		int temp = arr[pivotIndex];
		arr[pivotIndex] = arr[end];
		arr[end] = temp;

		return pivotIndex;
	}

	public static void quick_sort(int[] arr, int start, int end) {

		if (start < end) {
			int pIndex = partition(arr, start, end);
			quick_sort(arr, start, pIndex - 1);
			quick_sort(arr, pIndex + 1, end);
		}

	}

	public static void main(String[] args) {

		int[] a = { 14, 98, 3, 76, 31, 2 };
		quick_sort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));

	}

}
