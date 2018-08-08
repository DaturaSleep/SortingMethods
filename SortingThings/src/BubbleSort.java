
public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = { 6, 4, 7, 8, 8, 10, 3 };
		getOut(arr);
		sort(arr);
		getOut(arr);

	}

	/*
	 * Complexity: O(n^2)
	 */
	public static void sort(int arr[]) {
		int j = arr.length;

		while (j > 0) {
			for (int i = 1; i < j; i++) {
				if (arr[i - 1] > arr[i]) {
					int key = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = key;
				}
			}
			j--;
		}
	}

	public static void getOut(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

	}
}
