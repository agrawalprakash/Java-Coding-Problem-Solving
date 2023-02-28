package main;

public class FindSeconLargestInRotatedArray {
	
	public static void main (String[] args) {
		
		int[] arr = { 7, 5, 6, 1, 4, 2 };
		
		int secondHighest = findSecondLargestNumberInArray(arr);
		
		System.out.println("Second largest number in Array is " + secondHighest);
		
	}

	private static int findSecondLargestNumberInArray(int[] arr) {

		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			
			if (arr[i] > highest) {
				
				secondHighest = highest;
				highest = arr[i];
				
			} else if (arr[i] > secondHighest && arr[i] < highest) {
				
				secondHighest = arr[i];
			}
			
		}
		
		return secondHighest;
	}

}
