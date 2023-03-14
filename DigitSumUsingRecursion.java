package main;

public class DigitSumUsingRecursion {
	
	public static void main(String[] args) {
		
		int answer = sum(1234);
		
		System.out.println("Sum of the digits is " + answer);
		
	}
	
	private static int sum(int n) {
		
		if (n == 0) {
			return 0; 
		}
		
		return n%10 + sum(n/10);
		
	}

}
