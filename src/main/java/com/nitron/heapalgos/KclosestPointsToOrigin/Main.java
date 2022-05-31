package com.nitron.heapalgos.KclosestPointsToOrigin;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] points = {{3,3},{5,-1}, {-2,4}};
        int k =2;

        System.out.println(Arrays.deepToString(new KClosestPointsToOrigin().find(points, k)));

    }

}
