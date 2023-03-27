package main;

public class ArraySortedOrNotUsingRecursion {
	
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 5, 8, 18};
		
		System.out.println(isSorted(arr, 0));
	}
	
	private static boolean isSorted(int[] arr, int index) {
		
		
		if (index == arr.length-1) {
			return true;
		}
		
		return (arr[index] < arr[index+1]) && isSorted(arr, index+1);
		
	}

}
