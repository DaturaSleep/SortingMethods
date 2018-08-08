
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 3, 8, 9, 5, 4, 1 };
		getOut(arr);
		sort(arr);
		getOut(arr);

	}
	
	/*
	 * Complexity O(n^2)
	 */
	public static void sort(int[] arr) {
		int size = arr.length;
		for (int i = 1; i < size; i++) {
			int key = arr[i];
			int j = i - 1;

			// For reverse change arr[j] < key
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = key;
		}

	}

	public static void getOut(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

	}
}
