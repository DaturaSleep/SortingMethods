
public class QuickSort {
	public static void main(String[] args) {
		int arr[] = { 6, 4, 7, 8, 8, 10, 3 };
		getOut(arr);
		sort(arr, 0, arr.length - 1);
		getOut(arr);
	}
	/*
	 * Complexity: O(n^2)
	 */
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;

				int swap = arr[i];
				arr[i] = arr[j];
				arr[j] = swap;

			}
		}

		int swap = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = swap;

		return i;

	}

	public static void sort(int[] arr, int low, int high) {
		if (low < high) {
			int pivot = partition(arr, low, high);

			sort(arr, low, pivot - 1);
			sort(arr, pivot + 1, high);
		}

	}

	public static void getOut(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
