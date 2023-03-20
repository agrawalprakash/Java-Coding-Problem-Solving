package main;

public class ElementInInfiniteArray {
	
	public static void main(String[] args) {
		
		int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
		
		int target = 100;
		
		System.out.print("Index of element searched is " + getRangeAndSearch(arr, target));
	}
	
	static int getRangeAndSearch(int[] arr, int target) {
		
		int start = 0;
		int end = 1;
		
		while (end < arr.length && target > arr[end]) {
			
			int newStart = end + 1;
			
			end = end + (end - start + 1)*2;
			
			start = newStart;
			
		}
		
		return binarySearch(arr, target, start, end);
		
	}
	
	private static int binarySearch(int[] arr, int target, int start, int end) {
		
		while (start <= end) {
			
			int mid = start + (end - start)/2;
			
			if (arr[mid] == target) {
				return mid;
			} else if (target > arr[mid]) {
				start = mid+1;
				
			} else if (target < arr[mid]) {
				end = mid - 1;
				
			}
			
		}
		
		return -1;
		
	}
	
	

}
