package main;

public class NumberOfStepsToReduceNumberToZero {
	
	public static void main (String[] args) {
		
		System.out.println("The number of steps to reduce number to zero " + numberOfSteps(55505));
		
	}
	
	static int numberOfSteps(int num) {
		
		return helper(num, 0);
		
	}
	
	private static int helper (int num, int steps) {
		
		if (num == 0) {
			return steps;
		}
		
		if (num%2 == 0) {
			return helper(num/2, steps + 1);
		}
		
		return helper(num - 1, steps + 1);
		
	}

}
