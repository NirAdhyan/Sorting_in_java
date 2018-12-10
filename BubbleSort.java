
public class BubbleSort {

	public static void main(String[] args) {

		//Input a list of numbers
		int list[] = new int[args.length];
				
		//Store the numbers into an array
		System.out.println("Before Sorting: ");
		for(int i = 0; i < args.length; i++) {
			list[i]=Integer.parseInt(args[i]);
			System.out.print(list[i] + " ");
		}
		
		BubbleSort bs = new BubbleSort();
		//Sort the array
		bs.sort(list);
		
		System.out.print("\n\n");
		
		//Print the sorted array
		System.out.println("After Sorting: ");
		for(int i = 0; i < args.length; i++) {
			System.out.print(list[i] + " ");
		}
	}
	
	//Bubble Sorting
	void sort(int[] array) {
		int temp = 0;
		
		//Traverse through the array.
		//The largest number moves to the right end of the array
		for(int i = 0; i < array.length; i++)
			for(int j = 1; j < array.length-i; j++) {
				if(array[j-1] > array[j]) {
					temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
	}
}
