package main;

public class PrintNumbersBackAndFront {
	
	public static void main(String[] args) {
		
		printFunction(5);
		
	}
	
	private static void printFunction(int n) {
		
		if (n == 0) {
			System.out.println();
			return;
		}
		
		System.out.print(n);
		
		printFunction(n-1);
		
		System.out.print(n);
		
	}

}
