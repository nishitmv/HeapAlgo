package com.nitron.heapalgos.KclosestPointsToOrigin;

public class Point {

    private int x;
    private int y;
    private long sumOfSquares;

    public Point(int x, int y, long sumOfSquares) {
        this.x = x;
        this.y = y;
        this.sumOfSquares = sumOfSquares;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public long getSumOfSquares() {
        return sumOfSquares;
    }


}
