package main;

public class SearchElementSortedRotatedArray {
	
	public static void main(String[] args) {
		
		int[] arr = {16, 19, 21, 25, 3, 5, 8, 10};
		
		System.out.println("Index of number 5 is " + findElementInRotatedSortedArray(arr, 21));		
	
	}
	
	public static int findElementInRotatedSortedArray(int[] arr, int number) {
		
		int low = 0;
		int high = arr.length-1;
		
		int mid = 0;
		
		while (low <= high) {
			
			mid = low + (high - low)/ 2;
			
			if (arr[mid] == number) {
				return mid;
			} else if (arr[mid] <= arr[high]) {
				
				if (number > arr[mid] && number <= arr[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
				
			} else {
				
				if (number >= arr[low] && number < arr[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
				
			}
			
			
		}
		
		return -1;
		
	}

}
