package main;

public class ReverseDigitsUsingRecursion {
	
	static int sum = 0;
	
	static void reverse(int n) {
		
		if ( n == 0) {
			return;
		}
		
		int rem = n % 10;
		
		sum = sum*10 + rem;
		
		reverse( n/10 );
		
	}
	
	public static void main (String[] args) {
		
		reverse(14789);
		
		System.out.println("Reverse of number 14789 is " + sum);
	}

}
