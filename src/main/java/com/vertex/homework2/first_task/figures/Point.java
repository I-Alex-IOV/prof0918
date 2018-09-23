package com.vertex.homework2.first_task.figures;

public final class Point {

    private int x;
    private int y;

    public Point(){
        this(0, 0);
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point setX(int x){
        return new Point(x, this.y);
    }

    public Point setY(int y){
        return new Point(this.x, y);
    }

    @Override
    public String toString() {
        return "point " +
                "x = " + x +
                ", y = " + y;
    }
}
