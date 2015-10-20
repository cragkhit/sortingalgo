package gs04;

/***
 * A simple implementation of the bubble sort algorithm
 * 
 * @author Chaiyong R.
 *
 */
public class BubbleSort {

	private int[] data;

	public BubbleSort(int[] data) {
		this.data = data;
	}

	public void sort() {
		// go through each item
		for (int i = data.length - 1; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				// compare two consecutive items. 
				// if item[j] less than item[j-1], swap them
				if (data[j] < data[j - 1]) {
					int tmp = data[j - 1];
					data[j - 1] = data[j];
					data[j] = tmp;
				}
			}
		}
	}

	public void printItems() {
		for (int k = 0; k < data.length; k++) {
			System.out.print(data[k] + " ");
		}
		System.out.println();
	}
}