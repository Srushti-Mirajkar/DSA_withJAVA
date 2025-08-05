package college.srushti;

public class Bubble_sort {
	public static void veryImpBubbleSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			boolean swap = false;
			for(int j=0; j<arr.length-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
			}
			if(swap == false) // array is already sorted
				break;			// no need to go for next passes
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] arr = {5, 6, 3, 8, 2, 4};
		System.out.print("Before Sort: "); 
		printArray(arr);

		veryImpBubbleSort(arr);
		System.out.print("After Sort: "); 
		printArray(arr);
	}
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + ", ");
		System.out.println();
	}
	}


