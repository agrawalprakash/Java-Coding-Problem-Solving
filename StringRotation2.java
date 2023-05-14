public class StringRotation2 {
	public static void main(String[] args) {
		
		System.out.println("prakashisrich and richprakashis are rotation of each other " +
		                   areTwoStringsRotation("prakashisrich", "richprakashis"));
		
		System.out.println("prakashisrich and richisprakash are rotation of each other " + 
		                   areTwoStringsRotation("prakashisrich" , "richprakashis"));
		
		
	}

	private static boolean areTwoStringsRotation(String string1, String string2) {
		
		String string3 = string1 + string1;
		
		return string3.contains(string2);
	}

}
