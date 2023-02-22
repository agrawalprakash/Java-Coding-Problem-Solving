package main;

public class LengthOfStringFunction {
	
	public static void main (String[] args) {
	
		String str1 = "Length of the String function";
	
		System.out.println("Length of the string is " + getLengthOfString(str1));
	
	}
	
	public static int getLengthOfString(String str1) {
		
		int i = 0;
		
		try {
			
			while (true) {
				char ch = str1.charAt(i++);
			}
			
		} catch (Exception ex) {
			
			
		}
		
		return i;
		
	}

}
