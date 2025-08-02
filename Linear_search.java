
package college.srushti;

import java.util.ArrayList;
import java.util.List;

public class Linear_search {
	/*public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if(key == arr[i])
				return i; // return index at which elem is found
		}
		return -1; // return -1 indicating elem not found
	}*/
	
	public static List<Integer> linearSearchAll(int[] arr, int key) {
		List<Integer> indexes = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if(key == arr[i])
				indexes.add(i); // store index in list (at which elem is found)
		}
		return indexes; // return all indexes
	}
	
	public static void main(String[] args) {
		int[] arr = {88, 33, 66, 99, 11, 77, 22, 55, 11};
		int key = 11; // input from user
		/*
		int index = linearSearch(arr, key);
		if(index != -1)
			System.out.println("Found at index: " + index);
		else
			System.out.println("Element Not Found.");
		*/
		List<Integer> indexes = linearSearchAll(arr, key);
		if(indexes.size() != 0)
			System.out.println("Found at indexes: " + indexes);
		else
			System.out.println("Element Not Found.");
	}
}