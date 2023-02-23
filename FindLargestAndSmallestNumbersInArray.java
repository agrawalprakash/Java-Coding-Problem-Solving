package main;

public class FindLargestAndSmallestNumbersInArray {
	
	public static void main(String[] args) {
		
		int arr[] = new int[] {12, 56, 76, 89, 100, 343, 443, 999};
		
		int smallest = arr[0];
		int largest = arr[0];
		
		for (int num : arr) {
			
			if (num < smallest) {
				
				smallest = num;
			}
			
			if (num > largest) {
				largest = num;
			}
			
			
			
		}
		
		System.out.println("Smallest number is " + smallest);
		System.out.println("Largest number is " + largest);
		
		
	}

}
