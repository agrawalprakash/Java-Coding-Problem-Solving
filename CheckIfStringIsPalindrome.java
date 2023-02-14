package main;

public class CheckIfStringIsPalindrome {
	
	public static boolean checkIfStringIsPalindrome(String input) {
		input = input.toLowerCase();
		int left = 0;
		int right = input.length() - 1;
		
		while (left < right) {
			
			if (input.charAt(left) != input.charAt(right)) {
				return false;
			}
			
			left++;
			right--;
			
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(checkIfStringIsPalindrome("aaaa"));
		
	}

}
