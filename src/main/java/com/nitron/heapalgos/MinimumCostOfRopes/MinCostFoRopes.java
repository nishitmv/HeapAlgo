package com.nitron.heapalgos.MinimumCostOfRopes;

import java.util.PriorityQueue;

public class MinCostFoRopes {
    public int findMinCost(int[] arr) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int ele : arr)
        {
            minHeap.add(ele);
        }

        int res =0;

        while(minHeap.size()>1)
        {
            int tmp = minHeap.remove()+minHeap.remove();
            res+=tmp;
            minHeap.add(tmp);

        }

          return res;

    }
}
