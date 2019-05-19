package sorting;

import java.util.Arrays;

public class MergeSort {

	public static void merge(int[] arr, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;

		int[] left_array = new int[n1 + 1];
		int[] right_array = new int[n2 + 1];
		int i;

		for (i = 0; i < n1; i++) {
			left_array[i] = arr[p + i];
		}
		left_array[i] = Integer.MAX_VALUE;
		
		int j;
		for (j = 0; j < n2; j++) {
			right_array[j] = arr[q + j + 1];
		}
		right_array[j] = Integer.MAX_VALUE;

		i = 0;
		j = 0;
		int k;

		for (k = p; k <= r; k++) {
			if (left_array[i] <= right_array[j]) {
				arr[k] = left_array[i];
				i++;
			} else {
				arr[k] = right_array[j];
				j++;
			}
		}
	}
	/* Dividing the array takes constant time */
	public static void merge_sort(int[] arr, int low, int high) {

		if (low < high) {
			int mid = (low + high) / 2;
			merge_sort(arr, low, mid);
			merge_sort(arr, mid + 1, high);
			merge(arr, low, mid, high); /* Merge Takes n time, it has to merge log n solutions so O(nlogn)*/
		}
	}

	public static void main(String[] args) {
		int[] a = { 14, 98, 3, 76, 31, 2 };
		merge_sort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}

}
