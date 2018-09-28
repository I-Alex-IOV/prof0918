package com.company.Figures;

import com.company.Point;

public class Square implements Figure{

    private int width;
    private Point p;


    public static class Builder {

        private int width = 0;
        private Point p;


        public Builder(int x, int y) {
            this.p = new Point(x, y);
        }

        public Builder width(int w) {
            width = w;
            return this;
        }

        public Square buidl() {
            return new Square(this);
        }
    }

    private Square(Builder builder) {
        width = builder.width;
        p = builder.p;
    }

    public void setWidth(int w)
    {
        this.width = w;
    }

    public void setHeight(int h)
    {
        this.width = h;
    }

    public void setPoint(int x, int y)
    {
        this.p = new Point(x, y);
    }

    public int getWidth()
    {
        return width;
    }

    public void printPoint()
    {
        p.getPoint();
    }

    public void printFigure()
    {
        System.out.println("Square:");
        System.out.print("  Bottom left coordinates: ");
        p.getPoint();
        System.out.println("  Width and height are: " + width + ", " + width);
    }
}
