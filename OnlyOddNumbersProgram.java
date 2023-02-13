package main;

import java.util.ArrayList;
import java.util.List;

public class OnlyOddNumbersProgram {
	
	public static boolean onlyOddNumbers (List<Integer> list) {
		
		return !list.parallelStream().anyMatch(x -> x%2 == 0);
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		
		System.out.println(onlyOddNumbers(list));
		
	}

}
