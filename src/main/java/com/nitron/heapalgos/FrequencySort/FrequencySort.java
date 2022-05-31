package com.nitron.heapalgos.FrequencySort;

import java.util.*;

public class FrequencySort {
    public List<Integer> sortByFreq(int[] arr) {

        var minHeap = new PriorityQueue<Tuple>(Comparator.comparingInt(Tuple::getFreq).reversed());

        var map = new HashMap<Integer, Integer>();

        for(int ele: arr)
        {
           map.computeIfPresent(ele , (k, v)-> ++v);
           map.putIfAbsent(ele, 1);
        }

        map.forEach((k,v)-> minHeap.add(new Tuple(k, v)));

        List<Integer> res = new ArrayList<>();

        for(int i=0;i<map.size();i++)
        {
            res.add(minHeap.poll().getVal());
        }

        return res;
    }

}
