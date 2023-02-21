package main;

public class AllSubstringsOfMainString {
	
	public static void main(String[] args) {
		String str = "abbcdee";
		
		System.out.println("All substrings of abbcdee are: ");
		
		for (int i=0; i < str.length(); i++) {
			
			for (int j = i+1; j <= str.length(); j++) {
				
				System.out.println(str.substring(i, j));
			}
			
		}
		
	}

}
