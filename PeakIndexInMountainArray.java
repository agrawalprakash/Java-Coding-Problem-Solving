package main;

public class PeakIndexInMountainArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 3, 5, 7, 4, 2};
		
		System.out.println("Peak index of mountain array is " + getPeakIndexInArray(arr));
		
	}

	private static int getPeakIndexInArray(int[] arr) {
		
		int start = 0;
		
		int end = arr.length - 1;
		
		while (start < end) {
			
			int mid = start + (end - start)/2;
			
			if (arr[mid] > arr[mid+1]) {
				end = mid;
			} else if (arr[mid] < arr[mid+1]) {
				start = mid + 1;
			} 
			
		}
		
		return start;
		
		
	}
}
