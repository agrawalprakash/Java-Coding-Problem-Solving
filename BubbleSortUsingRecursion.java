package main;

import java.util.Arrays;

public class BubbleSortUsingRecursion {
	
	public static void main(String[] args) {
		
		
		int[] arry = {4, 3, 2, 1};
		
		bubble(arry, arry.length-1, 0);
		
		System.out.print(Arrays.toString(arry));
		
	}

	private static void bubble(int[] arry, int row, int col) {
		// TODO Auto-generated method stub
		
		if (row == 0) {
			return;
		}
		
		if (col < row) {
			
			if (arry[col] > arry[col+1]) {
				// swap
				int temp = arry[col];
				arry[col] = arry[col+1];
				arry[col+1] = temp;
			}
			
			bubble(arry, row, col+1);
			
		} else {
			
			bubble(arry, row-1, 0);
			
		}
		
	}
	
	

}
