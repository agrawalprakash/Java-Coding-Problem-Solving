package main;

public class CountZeroes {
	
	public static void main(String[] args) {
		
		System.out.println("Count of Number of Zeroes in number is " + count(90909));
		
	}

	static int count (int n) {
		
		return helper( n , 0);
		
	}
	
	private static int helper (int n, int count) {
		
		if (n == 0) {
			return count;
		}
		
		if ( n%10 == 0 ) {
			return helper(n/10 , count+1);
		}
		
		return helper(n/10, count);
		
	}
}
