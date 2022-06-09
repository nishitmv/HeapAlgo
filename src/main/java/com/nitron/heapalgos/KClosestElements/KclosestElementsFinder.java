package com.nitron.heapalgos.KClosestElements;

import java.util.*;

public class KclosestElementsFinder {
    public List<Integer> find(int[] arr, int k, int x) {

        var maxHeap = new PriorityQueue<Tuple>( Comparator.comparingInt(Tuple::getDiff).reversed());

        for (int ele : arr) {
            int diff = 0;
            diff = ele > x ? ele - x : x - ele;
            maxHeap.add(new Tuple(ele, diff));
            if (maxHeap.size() > k)
                maxHeap.remove();
        }

        var list = new ArrayList<Integer>();

       maxHeap.forEach(t -> list.add(t.getValue()));
        return list;
    }
}
