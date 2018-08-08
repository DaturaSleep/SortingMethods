
public class AlwaysRemember {
	public static void main(String[] args) {
		int[] arr = { 1, 0, 4, 7, 8, 5 };
		getOut(arr);
		selectionSort(arr);
		getOut(arr);

	}

	public static void selectionSort(int[] arr) {
		int size = arr.length;
		int minIndex;
		
		for (int i = 0; i < size - 1; i++) {
			minIndex = i;
			
			for(int j = i; j<size; j++) {
				if(arr[j]<arr[minIndex]) {
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

	public static void getOut(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

	}
}
