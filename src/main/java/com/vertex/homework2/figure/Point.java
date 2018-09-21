package com.vertex.homework2.figure;

import java.util.Objects;

public class Point {
    private int x;
    private int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
        }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point setX(int x) {
        return new Point(x,this.y);
    }

    public Point setY(int y) {
        return new Point(this.x,y);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("com.cameramnet1.figure.Point{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return getX() == point.getX() &&
                getY() == point.getY();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getX(), getY());
    }
}
