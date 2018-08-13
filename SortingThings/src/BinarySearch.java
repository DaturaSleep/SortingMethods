
public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
		System.out.println(search(arr, 0, arr.length - 1, 23));

	}
	
	/*
	 *Complexity O(log(n))
	 */
	public static int search(int arr[], int l, int r, int x) {
		if (r >= l) {
			int middle = l + (r - l) / 2;
			if (arr[middle] == x) {
				return middle;
			} else if (x > arr[middle]) {
				 return search(arr, middle + 1, r, x);
			} else if (x < arr[middle]) {
				return search(arr, l, middle - 1, x);
			}
		}

		return -1;

	}
}
