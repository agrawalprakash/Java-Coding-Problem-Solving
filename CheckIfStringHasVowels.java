package main;

public class CheckIfStringHasVowels {
	
	public static void main(String[] args) {
		
		System.out.println(checkIfVowelExistsInString("Hellow\\\\"));
		
		System.out.println(checkIfVowelExistsInString("VY"));
		
	}

	private static boolean checkIfVowelExistsInString(String input) {
		
		
		return input.toLowerCase().matches(".*[aeiou].*");
		
	}

}
