package main;

public class NumberOddTimesMain {
	
	int getOddTimesElement(int[] arr) {
		
		int result = 0;
		
		for (int i=0; i < arr.length; i++) {
			
			// XOR operation
			result = result ^ arr[i];
			
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		NumberOddTimesMain instance = new NumberOddTimesMain();
		
		int[] arr = new int[] {20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
		
		System.out.println("One number that occurs odd number of times is " + instance.getOddTimesElement(arr));
		
	}

}
