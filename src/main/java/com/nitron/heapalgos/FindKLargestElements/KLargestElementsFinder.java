package com.nitron.heapalgos.FindKLargestElements;

import java.util.PriorityQueue;

public class KLargestElementsFinder {
    public void find(int[] arr, int k) {

        var minHeap = new PriorityQueue<Integer>();

        for(int x: arr)
        {
            minHeap.add(x);

            if(minHeap.size()>k)
                minHeap.remove();
        }

        minHeap.forEach(System.out::println);

    }
}
