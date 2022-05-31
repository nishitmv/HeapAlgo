package com.nitron.heapalgos.FrequencySort;

import java.util.HashMap;
import java.util.PriorityQueue;

public class FrequencySortLeetCode {

    public int[] frequencySort(int[] nums) {
        var minHeap = new PriorityQueue<Tuple>((t1, t2) -> {

            if (t1.getFreq() == t2.getFreq()) {
                if (t1.getVal() > t2.getVal())
                    return -1;
                if (t1.getVal() < t2.getVal())
                    return 1;
            } else if (t1.getFreq() > t2.getFreq())
                return 1;
            else if (t1.getFreq() < t2.getFreq())
                return -1;

            return 0;
        });

        var map = new HashMap<Integer, Integer>();

        for (int ele : nums) {
            map.computeIfPresent(ele, (k, v) -> ++v);
            map.putIfAbsent(ele, 1);
        }

        map.forEach((k, v) -> minHeap.add(new Tuple(k, v)));

        int[] arr = new int[nums.length];

        int j = 0;
        for (int i = 0; i < map.size(); i++) {
            Tuple t = minHeap.poll();
            int val = t.getVal();
            int freq = t.getFreq();
            while (freq > 0) {
                arr[j] = val;
                j++;
                freq--;
            }
        }

        return arr;
    }

    public class Tuple {

        private int val;
        private int freq;

        public Tuple(int val, int freq) {
            this.val = val;
            this.freq = freq;
        }

        public int getFreq() {
            return this.freq;
        }

        public int getVal() {
            return this.val;
        }

    }
}
