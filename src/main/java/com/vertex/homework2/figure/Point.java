package com.vertex.homework2.figure;


public class Point {

    private double x;
    private  double y;

    public Point(double x, double y){

        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public Point setX(double x) {
        return new Point(x,this.y );
    }

    public double getY() {
        return y;
    }

    public Point setY(double y) {
        return new Point(this.x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "Coordinate x = " + x +
                ", Coordinate y = " + y +
                '}';
    }

//    public static void main(String[] args) {
//
//        Point point = new Point(0.0, 0.0);
//        System.out.println(point);
//        Point point2 = point.setX(2.5).setY(5.9);
//        System.out.println(point2);
//        System.out.println(point);
//    }
}
