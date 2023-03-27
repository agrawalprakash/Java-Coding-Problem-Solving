package main;

public class LinearSearchUsingRecursion {
	
	
	public static void main(String[] args) {
		
		int[] arr = {3, 4, 7, 8, 9 };
		
		System.out.println(findIndex(arr, 9, 0));
		
	}
	
	static int findIndex(int[] arr, int target, int index) {
		
		if (index == arr.length) {
			return -1;
		}
		
		if (arr[index] == target) {
			return index;
		} else {
			return findIndex(arr, target, index+1);
		}
		
	}

}
