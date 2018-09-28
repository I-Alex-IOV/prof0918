package com.company.Figures;

import com.company.Point;

public class Circle implements Figure {

    private int width;
    private Point point;

    public static class Builder{

        private int width = 0;
        private Point centre;


        public Builder(int x, int y) {
            this.centre = new Point(x, y);
        }

        public Builder width(int w) {
            width = w;
            return this;
        }

        public Circle buidl() {
            return new Circle(this);
        }
    }

    private Circle(Builder builder) {
        width = builder.width;
        point = builder.centre;
    }

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        width = h;
    }

   public void setPoint(int x, int y) {
        point = new Point(x, y);
    }

    public void printPoint() {
        point.getPoint();
    }

    public int getWidth(){
        return width;
    }

    public void printFigure()
    {
        System.out.println("Circle:");
        System.out.print("  Centre coordinates: ");
        point.getPoint();
        System.out.println("  Width and height are: " + width + ", " + width);
    }
}
