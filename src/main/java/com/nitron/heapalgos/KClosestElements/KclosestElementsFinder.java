package com.nitron.heapalgos.KClosestElements;

import java.util.*;

public class KclosestElementsFinder {
    public List<Integer> find(int[] arr, int k, int x) {

        var minHeap = new PriorityQueue<Tuple>( Comparator.comparingInt(Tuple::getDiff).reversed());

        for (int ele : arr) {
            int diff = 0;
            diff = ele > x ? ele - x : x - ele;
            minHeap.add(new Tuple(ele, diff));
            if (minHeap.size() > k)
                minHeap.remove();
        }

        var list = new ArrayList<Integer>();

       minHeap.forEach(t -> list.add(t.getValue()));
        return list;
    }
}
