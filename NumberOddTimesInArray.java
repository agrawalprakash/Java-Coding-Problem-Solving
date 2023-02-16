package main;

public class NumberOddTimesInArray {
	
	public static int getOddTimesElement (int[] arr) {
		
		int i;
		int result = 0;
		
		for (i = 0; i < arr.length; i++) {
			
			result = result ^ arr[i];
			
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		NumberOddTimesInArray occur = new NumberOddTimesInArray();
		
		int[] array = new int[] {20, 40, 50, 20, 40, 50, 50, 50, 90};

		System.out.println("Number which occur odd number of times is " + occur.getOddTimesElement(array));
	}

}
