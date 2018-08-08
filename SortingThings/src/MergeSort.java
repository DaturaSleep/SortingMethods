
public class MergeSort {
	public static void main(String[] args) {
		int arr[] = { 38, 27, 43, 3, 9, 82, 10 };
		getOut(arr);
		sort(arr, 0, arr.length - 1);
		getOut(arr);
	}
	
	/*
	 * Complexity: O(n*log(n))
	 */
	private static void sort(int[] arr, int l, int r) {
		if (l < r) {
			int middle = (l + r) / 2;
			sort(arr, l, middle);
			sort(arr, middle + 1, r);

			merge(arr, l, middle, r);

		}

	}

	private static void merge(int[] arr, int l, int middle, int r) {

		int leftSize = middle - l + 1;
		int rightSize = r - middle;
		int[] L = new int[leftSize];
		int[] R = new int[rightSize];

		for (int i = 0; i < leftSize; i++)
			L[i] = arr[i + l];

		for (int i = 0; i < rightSize; i++)
			R[i] = arr[i + 1 + middle];

		int i = 0;
		int j = 0;
		int val = l;
		while (i < leftSize && j < rightSize) {
			if (L[i] >= R[j]) {
				arr[val] = R[j];
				j++;
			} else {
				arr[val] = L[i];
				i++;
			}
			val++;
		}

		while (i < leftSize) {
			arr[val] = L[i];
			i++;
			val++;
		}

		while (j < rightSize) {
			arr[val] = R[j];
			j++;
			val++;
		}

	}

	public static void getOut(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

	}
}
