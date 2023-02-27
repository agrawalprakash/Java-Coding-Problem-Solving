package main;

public class MinimumElementSortedAndRotatedArray {
	
	public static void main(String[] args) {
		
		int[] arr = {16, 19, 22, 25, 3, 8, 9, 11};
		
		System.out.println("Minimum element in array is " + 
		findTheMinimumElement(arr));
		
	}

	private static int findTheMinimumElement(int[] arr) {
		
		int start = 0;
		int end = arr.length - 1;
		
		while (start < end) {
			
			int mid = start + (end - start)/2;
			
			if (arr[mid] > arr[end]) {
				
				start = mid+1;
				
			} else {
				
				end = mid;
				
			}
			
		}
		
		return arr[start];
	}
	

}
