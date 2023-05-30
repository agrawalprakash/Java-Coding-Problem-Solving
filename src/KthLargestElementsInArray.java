package src;

import java.util.PriorityQueue;

public class KthLargestElementsInArray {

    public int findKthLargestElementInArray(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue(k+1);

        for (int i : nums) {

            pq.add(i);

            if (pq.size() > k) {
                pq.poll();
            }

        }

        return pq.poll();

    }
    
}
