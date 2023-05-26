package src;

import java.util.ArrayList;
import java.util.List;

public class PancakeSorting {
    public List<Integer> pancakeSort(int[] arr) {
        
        List<Integer> list = new ArrayList<>();

        for (int n = arr.length; n > 0; n--) {

            int index = find(arr, n);

            flip(arr, index);
            flip(arr, n-1);

            list.add(index+1);
            list.add(n);

        }

        return list;
    }

        private int find (int[] arr, int target) {

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }

            return -1;

        }

        private void flip (int[] arr, int j) {

            int i = 0;

            while (i < j) {

                int temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;

            }

        }


    
}