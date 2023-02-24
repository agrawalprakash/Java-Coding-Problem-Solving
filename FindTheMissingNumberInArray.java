package main;

public class FindTheMissingNumberInArray {
	
	 public static void main (String[] args) {
		 
		 int[] arr1 = {7, 5, 6, 1, 4, 2};
		 
		 System.out.println("Missing number in the array is " + getTheMissingNumber(arr1));
		 
		 int[] arr2 = {5, 3, 1, 2};
		 
		 System.out.println("Missing number in the array is " + getTheMissingNumber(arr2));
		 
	 }

	private static int getTheMissingNumber(int[] arr2) {
		
		int n = arr2.length + 1;
		
		int sum = n * (n + 1)/2;
		
		int arrSum = 0;
		
		for (int num : arr2) {
			arrSum += num;
		}
		
		return sum - arrSum;
	}

}
