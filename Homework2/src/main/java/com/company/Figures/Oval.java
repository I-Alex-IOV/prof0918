package com.company.Figures;

public class Oval implements Figure{
    private Circle circle;
    private int height;

    public static class Builder {

        private int width = 0;
        private int height = 0;
        private int x;
        private int y;

        public Builder(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Oval.Builder width(int w) {
            width = w;
            return this;
        }

        public Oval.Builder height(int h) {
            height = h;
            return this;
        }

        public Oval buidl() {
            return new Oval(this);
        }
    }

    public Oval(Builder builder) {
        circle = new Circle.Builder(builder.x, builder.y)
                .width(builder.width)
                .buidl();
        height = builder.height;
    }

    public void setHeight(int h)
    {
        height = h;
    }

    public void setPoint(int x, int y)
    {
        circle.setPoint(x, y);
    }

    public void setWidth(int w)
    {
        circle.setWidth(w);
    }

    public void printFigure()
    {
        System.out.println("Oval:");
        System.out.print("  Bottom left coordinates: ");
        circle.printPoint();
        System.out.println("  Width and height are: " + circle.getWidth() + ", " + height);
    }
}
