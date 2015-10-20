package gs04;

import java.util.ArrayList;

/***
 * A simple implementation of the insertion sort algorithm
 * @author Chaiyong R.
 *
 */
public class InsertionSort implements SorterInterface {
	/***
	 * The array list to store sorted items
	 */
	private ArrayList<Integer> sorted = new ArrayList<Integer>();

	@Override
	public void sort(int[] n) {
		boolean added = false;
		for (int i = 0; i < n.length; i++) {
			if (i == 0) {
				// first item, just add it to the result
				sorted.add(n[i]);
			} else {
				added = false;
				for (int j = 0; j < sorted.size(); j++) {
					// add the item when it's the biggest one
					if (n[i] < sorted.get(j)) {
						sorted.add(j, n[i]);
						added = true;
						break;
					}
				}
				// the last biggest item, add it at the end
				if (!added)
					sorted.add(n[i]);
			}
		}
	}

	@Override
	public void printItems() {
		for (int k = 0; k < sorted.size(); k++) {
			System.out.print(sorted.get(k) + " ");
		}
		System.out.println();
	}
}
