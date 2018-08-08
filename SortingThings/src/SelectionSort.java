
public class SelectionSort {
	public static void main(String args[]) {
		int[] arr = { 3, 8, 9, 5, 4, 1 };
		getOut(arr);
		sort(arr);
		getOut(arr);

	}

	private static void sort(int[] arr) {
		int size = arr.length;
		for (int i = 0; i < size - 1; i++) {
			int minIndex = i;

			for (int j = i; j < size; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			int val = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = val;

		}

	}

	public static void getOut(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
