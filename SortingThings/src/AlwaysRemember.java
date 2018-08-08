
public class AlwaysRemember {
	public static void main(String[] args) {
		int[] arr = { 1, 0, 4, 7, 8, 5 };
		getOut(arr);
		mergeSort(arr, 0, arr.length - 1);
		getOut(arr);
		System.out.println(binarySearch(arr, 0, arr.length - 1, 8));

	}

	public static void mergeSort(int[] arr, int l, int r) {
		if (l < r) {
			int middle = (l + r) / 2;
			mergeSort(arr, l, middle);
			mergeSort(arr, middle + 1, r);

			sorter(arr, l, middle, r);
		}

	}

	private static void sorter(int[] arr, int l, int m, int r) {

		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public static void selectionSort(int[] arr) {
		int size = arr.length;
		int minIndex;

		for (int i = 0; i < size - 1; i++) {
			minIndex = i;

			for (int j = i; j < size; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			int key = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = key;
		}
	}

	public static void insertionSort(int[] arr) {
		int size = arr.length;
		int j;
		int key;
		for (int i = 1; i < size; i++) {
			if (arr[i] < arr[i - 1]) {
				j = i - 1;
				key = arr[i];
				while (j >= 0 && key < arr[j]) {
					arr[j + 1] = arr[j];
					j--;
				}
				arr[j + 1] = key;

			}
		}
	}

	public static int binarySearch(int[] arr, int left, int right, int key) {
		if (right >= left) {
			int middle = ((right - left) / 2) + left;

			if (arr[middle] == key) {
				return middle;
			} else if (key < arr[middle]) {
				return binarySearch(arr, left, middle - 1, key);
			} else if (key > arr[middle]) {
				return binarySearch(arr, middle + 1, right, key);
			}

		}
		return -1;
	}

	public static void getOut(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

	}
}
