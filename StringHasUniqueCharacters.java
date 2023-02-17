package main;

import java.util.HashSet;

public class StringHasUniqueCharacters {
	
	public static void main(String[] args) {
		
		System.out.println("AllisWell has unique characters " + hasAllUniqueChars("abcde"));		
	}

	private static boolean hasAllUniqueChars(String words) {
		
		char[] arry = words.toCharArray();
		
		HashSet<Character> hset = new HashSet<>();
		
		for (char ch : arry) {
			
			if (!hset.add(ch)) {
				return false;
			} 
		}
		
		return true;
	}
	

}
