package sorting;

import java.util.Arrays;

public class QuickSort {

	public static int partition(int[] arr, int start, int end) {

		int pivot = arr[end];
		int pivotIndex = start;

		for (int i = start; i <= end - 1; i++) {
			if (arr[i] <= pivot) {
				swap(arr,i,pivotIndex);				
				pivotIndex++;

			}
		}
		//swap a[pivot] and a[end]
		swap(arr,pivotIndex,end);

		return pivotIndex;
	}
	
	 private static void swap(int[] array,int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }

	public static void quick_sort(int[] arr, int start, int end) {

		if (start < end) {
			int pIndex = partition(arr, start, end);
			quick_sort(arr, start, pIndex - 1);
			quick_sort(arr, pIndex + 1, end);
		}

	}

	public static void main(String[] args) {

		int[] a = { 1000,14, 98, 3, 10002,76, 31, 2 };
		quick_sort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));

	}

}