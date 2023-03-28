package main;

import java.util.ArrayList;

public class LinearSearchUsingRecursion {
	
	
	public static void main(String[] args) {
		
		int[] arr = {3, 4, 9, 8, 9 };
		
		System.out.println(findIndex(arr, 9, 0));
		
		ArrayList<Integer> list = 
				findAllIndexesOfElement(arr, 9, 0, new ArrayList<>());
		System.out.println(list);
	}
	
	static int findIndex(int[] arr, int target, int index) {
		
		if (index == arr.length) {
			return -1;
		}
		
		if (arr[index] == target) {
			return index;
		} else {
			return findIndex(arr, target, index+1);
		}
		
	}
	
	static ArrayList findAllIndexesOfElement(int[] arr, int target, 
											 int index, ArrayList<Integer> list) {
		
		if (index == arr.length) {
			return list;
		}
		
		if (arr[index] == target) {
			list.add(index);
		}
		
		return findAllIndexesOfElement(arr, target, index+1, list);
		
	}
	
	static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		if (index == arr.length) {
			return list;
		}
		
		if (target == arr[index]) {
			list.add(index);
		}
		
		ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index+1);
		
		list.addAll(ansFromBelowCalls);
		
		return list;
	}
}
