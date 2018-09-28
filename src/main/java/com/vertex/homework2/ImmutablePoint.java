package com.vertex.homework2;

public class ImmutablePoint {
    private double x;
    private double y;
    public ImmutablePoint(double x,double y){
        this.x=x;
        this.y=y;
    }
    public ImmutablePoint setX(double x){
        return new ImmutablePoint(x,this.y);
    }
    public ImmutablePoint setY(double y){
        return new ImmutablePoint(this.x,y);
    }
    public ImmutablePoint changePoint(int x,int y){
        return new ImmutablePoint(x,y);
    }
}
