package com.vertex.homework2;

import com.vertex.homework2.implementations.AbstractFigure;

public class Square extends AbstractFigure {
    double a;
    ImmutablePoint point;
    String color;
    public Square(double a,ImmutablePoint point,String color){
        this.a=a;
        this.point=point;
        this.color=color;
    }
    public void setA(int a){
        this.a=a;
    }
    public void setPoint(ImmutablePoint point){
        this.point=point;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double getA(){
        return a;
    }
    public ImmutablePoint getPoint() {
        return point;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void toDraw() {
        System.out.println("Drawing...Done!");
    }
}
