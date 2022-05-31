package com.nitron.heapalgos.TopKFrequentElements;

import java.util.*;

public class TopKFrequentElements {
    public List<Integer> getTopKFrequentElements(int[] arr, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int ele: arr)
        {
            map.computeIfPresent(ele, (key,v)-> ++v);
           map.putIfAbsent(ele, 1);
        }

    var minHeap = new PriorityQueue<Tuple>(Comparator.comparingInt(Tuple::getFreq));

        map.forEach((val, freq)-> {

            minHeap.add(new Tuple(val, freq));

            if(minHeap.size()>k)
                minHeap.remove();
        });

        System.out.println(minHeap);

        List<Integer> list = new ArrayList<>();

        minHeap.forEach(ele -> list.add(ele.getVal()));




        return list;
    }
}
