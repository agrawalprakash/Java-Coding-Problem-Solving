package main;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountLettersInString {
	
	public Map<Character, Integer> countLettersInString(String str) {
		
		Map<Character, Integer> charCountMap = new LinkedHashMap<>();
		
		for (int i=0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if (charCountMap.containsKey(ch)) {
				
				charCountMap.put(ch, charCountMap.get(ch) + 1);
				
			} else {
				
				charCountMap.put(ch, 1);
				
			}
			
		}
		
		return charCountMap;
		
	}

}
