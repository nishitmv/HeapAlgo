package com.nitron.heapalgos.SortNearlySortedKSortedArray;

public class Main {

    public static void main(String[] args) {

        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;

        System.out.println(new KsortedArraySorter().sort(arr, k));

    }
}
