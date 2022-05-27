package com.nitron.heapalgos.SortNearlySortedKSortedArray;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KsortedArraySorter {
    public List<Integer> sort(int[] arr, int k) {

        var minHeap = new PriorityQueue<Integer>();
        List<Integer> result = new ArrayList<>(arr.length);
        for(int x: arr )
        {
            minHeap.add(x);

            if(minHeap.size()>k)
            {
                result.add(minHeap.remove());
            }
        }
        result.addAll(minHeap);
        return result;

    }
}
