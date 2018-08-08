
public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = { 3, 0, 4, 4, 5, 6, 7 };
		System.out.println(search(4, arr));
	}
	
	/*
	 * Complexity: O(n)
	 */
	public static int search(int v, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(v == arr[i])
				return i;
		}
		return 0;

	}

}
