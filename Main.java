package Kth_smallest_or_largest;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
        int k = 2;
        int n = arr.length;
        
        //method 1
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
        
        //method 2
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < n; i++) {
            pq.offer(arr[i]);
            if (pq.size() > k)
                pq.poll();
        }
        System.out.println(pq.peek());
	}
}
