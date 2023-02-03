package main;

import java.util.Arrays;

public class CheckAnagrams {

	public boolean isAnagram(String str1, String str2) {
		
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray2);
		
	}
	
}
