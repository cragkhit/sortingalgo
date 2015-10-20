package gs04;

public class Main {

	public static void main(String[] args) {
		int[] data = {100, -5, 25, -32, 44, 98, 0, -1, 1, 76, -2};
		
		System.out.println("sorting by bubble sort algorithm...");
		BubbleSort bubble = new BubbleSort(data);
		bubble.sort();
		bubble.printItems();
		
		System.out.println("sorting by insertion sort algorithm...");
		InsertionSort insert = new InsertionSort();
		insert.sort(data);
		insert.printItems();
	}
}
