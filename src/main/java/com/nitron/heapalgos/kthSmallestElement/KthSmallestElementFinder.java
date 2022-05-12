package com.nitron.heapalgos.kthSmallestElement;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElementFinder {

    public static void main(String[] args) {

        int[] arr =  {7, 10, 4, 3, 20, 15};

        System.out.println(new KthSmallestElementFinder().findKthSmallestElement(arr, 3));

    }

    private Integer findKthSmallestElement(int[] arr, int k)
    {

        var maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int i : arr) {

            maxHeap.add(i);

            if(maxHeap.size()> k)
                maxHeap.remove();
        }
        return maxHeap.peek();
    }

}
