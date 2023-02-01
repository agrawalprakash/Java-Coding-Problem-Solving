package main;

public class SecondMaxInArray {
	
	public static int secMax(int[] arr) {
		
		int max = 0;
		int maxIndex = 0;
		for (int i=0; i < arr.length; i++) {
			
			if (max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
			
		}
		max = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if (i != maxIndex && (max < arr[i])) {
				max = arr[i];
			}
			
		}
		
		return max;
		
	}

}
