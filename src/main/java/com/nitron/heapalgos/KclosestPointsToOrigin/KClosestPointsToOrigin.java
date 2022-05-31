package com.nitron.heapalgos.KclosestPointsToOrigin;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    public int[][] find(int[][] points, int k) {

        // EUCLIDEAN DISTANCE : √(x1 - x2)^2 + (y1 - y2)^2) . Since x2 and y2 are 0 ( Origin ) . Distance : √(x1^2+y1^2)

        var maxHeap = new PriorityQueue<Point>(Comparator.comparingLong(Point::getSumOfSquares).reversed());

        for(int i=0 ; i<points.length; i++)
        {
           var point = new Point(points[i][0], points[i][1], ((long) points[i][0] *points[i][0]) + ((long) points[i][1] *points[i][1])) ;
            maxHeap.add(point);
            if(maxHeap.size()>k)
                maxHeap.remove();
        }

        int[][] result = new int[k][2];

        for(int i=0;i<k;i++) {
          var point =  maxHeap.poll();
          result[i][0] = point.getX();
          result[i][1] = point.getY();
        }
        return result;
    }
}
