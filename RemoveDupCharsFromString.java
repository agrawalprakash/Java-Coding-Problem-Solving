package main;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupCharsFromString {
	
	public static String removeDups(String str) {
		
		String result = "";
		
		Set<Character> charSet = new LinkedHashSet<>();
		
		for (char ch : str.toCharArray()) {
			
			charSet.add(ch);
			
		}
		
		for (Character ch : charSet) {
			
			result = result + ch;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		String test1 = "abaaEE";
		String result = removeDups(test1);
		System.out.println(result);
		
	}

}
