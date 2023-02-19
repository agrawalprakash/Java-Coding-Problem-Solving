package main;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacterInString {
	
	public static void main(String[] args) {
		
		String strg = "I am a great Software Engineer";
		
		Map<Character, Integer> charCountMap = new HashMap<>();
		
		for (int i = 0; i < strg.length(); i++) {
			
			char ch = strg.charAt(i);
			
			if (charCountMap.containsKey(ch)) {
				charCountMap.put(ch, charCountMap.get(ch) + 1 );
			} else {
				charCountMap.put(ch, 1);
			}
			
		}
		
		for (Character ch : charCountMap.keySet()) {
			
			if (charCountMap.get(ch) > 1) {
				
				System.out.println("Duplicate character " + ch +
									" has a count " + charCountMap.get(ch));
				
			}
			
		}
		
	}

}
