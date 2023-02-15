package main;

public class RemoveWhiteSpaceInString {
	
	public static String removeTheWhiteSpaces(String input) {
		
		StringBuilder output = new StringBuilder();
		
		char[] array = input.toCharArray();
		
		for (char ch : array) {
			
			if (!Character.isWhitespace(ch)) {
				
				output.append(ch);
				
			}
			
		}
		
		return output.toString();
		
	}

}
