package main;

public class MaxNumberInArray {
	
	public int max(int[] arrNum) {
		
		int max = arrNum[0];
		
		for (int num : arrNum) {
			
			
			if (num > max) {
				max = num;
			}
			
		}
		
		return max;
		
	}

}
