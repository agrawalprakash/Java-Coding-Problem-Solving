package main;

public class GetFirstNonRepeatingCharacterInString {
	
	public static void main(String[] args) 
	{

		System.out.println("First non repeated character for String anatology is " + getNonRepeatedCharacter("anatology"));
		
		System.out.println("First non repeated character for String very easy is " + getNonRepeatedCharacter("very easy"));
		
		
	}
	
	private static Character getNonRepeatedCharacter (String str) {
		
		char[] chars = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.lastIndexOf(chars[i]) == str.indexOf(chars[i])) {
				return chars[i];
			}
		}
		
		return null;
		
	}

}
