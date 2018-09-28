package com.vertex.homework2;

import com.vertex.homework2.implementations.AbstractFigure;

public class Circle extends AbstractFigure {
    ImmutablePoint centre;
    double radius;
    String color;
    public Circle(double radius,String color,ImmutablePoint centre){
        this.radius=radius;
        this.color=color;
        this.centre=centre;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setCentre(ImmutablePoint centre){
        this.centre=centre;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public ImmutablePoint getCentre(){
        return centre;
    }
    public String getColor(){
        return color;
    }

    @Override
    public void toDraw() {
        System.out.println("Drawing...Done!");
    }
}
