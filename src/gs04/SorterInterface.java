package gs04;

/***
 * Interface for sorters used in this project
 * @author Chaiyong
 *
 */
public interface SorterInterface {
	/***
	 * Sorting algorithm 
	 * @param data the array of data to be sorted
	 */
	public void sort(int[] data);

	/***
	 * Print out the item in the array
	 */
	public void printItems();
}
