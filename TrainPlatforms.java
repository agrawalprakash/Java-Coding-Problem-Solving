package main;

import java.util.Arrays;

public class TrainPlatforms {
	
	public static void main(String[] args) {
		
		int[] arr = {100, 140, 150, 200, 215, 400};
		int[] dep = {110, 300, 210, 230, 315, 600};
		
		System.out.println("Minimum number of platforms needed are " + 
							findPlatformsRequiredForStation(arr, dep, 6));
		
	}
	
	private static int findPlatformsRequiredForStation(int[] arr, int[] dep, int n) {
		
		Arrays.sort(arr);
		Arrays.sort(dep);
		
		int i = 0;
		int j = 0;
		
		int platform_needed = 0;
		int max_platforms = 0;
		
		while (i < n && j < n) {
			
			if (arr[i] < dep[j]) {
				platform_needed++;
				i++;
				
				if (platform_needed > max_platforms) {
					max_platforms = platform_needed;
				}
				
			} else {
				platform_needed--;
				j++;
			}
			
		}
		
		return max_platforms;
		
	}

}
