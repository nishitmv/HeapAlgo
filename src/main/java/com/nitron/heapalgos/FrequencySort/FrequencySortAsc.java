package com.nitron.heapalgos.FrequencySort;

import java.util.*;

public class FrequencySortAsc {
    public List<Integer> sortByFreq(int[] arr) {

        var minHeap = new PriorityQueue<Tuple>((t1, t2)->{

            if(t1.getFreq()==t2.getFreq())
            {
                if(t1.getVal()>t2.getVal())
                    return 1;
                if(t1.getVal()<t2.getVal())
                    return -1;
            }
            else if(t1.getFreq()>t2.getFreq())
                return 1;
            else if(t1.getFreq()<t2.getFreq())
                return -1;


            return 0;
        });

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
            Tuple t  = minHeap.poll();
            int val = t.getVal();
            int freq = t.getFreq();
            while(freq>0) {
                res.add(val);
                freq--;
            }
            }

        return res;
    }

}
