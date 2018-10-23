package com.vertex.homework2.figure.implementation;
import com.vertex.homework2.figure.Point;

public class Circle extends AbstractFigure {

    private double radius;
    private Point center;

    public Circle(){

    }

    public Circle( Point center, double radius){

        this.radius = radius;
        this.center = center;
    }

    public static class BuilderCircle {

        private Circle circle;

        public BuilderCircle() {
            circle = new Circle();
        }

            public BuilderCircle withRadius(double radius){
            circle.radius = radius;
            return this;
        }

        public BuilderCircle withCenter(Point center){
            circle.center = center;
            return this;
        }

        public Circle build(){
            return new Circle(circle.center, circle.radius);
        }

    }

    @Override
    public void draw() {
        System.out.println(toString());

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Circle{");
        sb.append(" radius = ").append(radius).append('\'');
        sb.append(", center = ").append(center);
        sb.append('}');
        return sb.toString();
    }
    public static void main(String[] args) {
        BuilderCircle builder = new BuilderCircle()
                .withCenter(new Point(Math.floor(Math.random()*100)/10, Math.floor(Math.random()*100)/10))
                .withRadius( Math.floor(Math.random()*100+1)/10);

        Circle circle1 = builder.build();

        circle1.draw();

        Circle circle2 = builder.withCenter(new Point(Math.floor(Math.random()*100)/10, Math.floor(Math.random()*100)/10)).withRadius(Math.floor(Math.random()*100+1)/10).build();

        circle2.draw();
        circle1.draw();


    }


}
