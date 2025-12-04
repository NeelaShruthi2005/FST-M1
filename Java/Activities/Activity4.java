package Examples;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4, 3, 2, 10, 12, 1, 5, 6 };

		for (int a : arr) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		
		insertionSort(arr);

		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

	public static void insertionSort(int[] a) {

		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;

			while (j >= 0 && a[j] > key) {

				a[j + 1] = a[j];
				j = j - 1;
			}

			a[j + 1] = key;

		}

	}

}
