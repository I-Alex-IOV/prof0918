package com.company.Figures;

public class Rectangular implements Figure{

    private Square sq;
    private int height;

    public static class Builder {

        private int width;
        private int height;
        private int x;
        private int y;
        private Square sq;

        public Builder(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Rectangular.Builder width(int w) {
            width = w;
            return this;
        }

        public Rectangular.Builder height(int h) {
            height = h;
            return this;
        }

        public Rectangular buidl() {
            sq = new Square.Builder(x, y)
                    .width(width)
                    .buidl();
            return new Rectangular(this);
        }
    }

    private Rectangular(Rectangular.Builder builder) {
        sq = builder.sq;
        height = builder.height;
    }

    public void setHeight(int h)
    {
        height = h;
    }

    public void setWidth(int w) {
        sq.setWidth(w);
    }

    public void setPoint(int x, int y) {
        sq.setPoint(x, y);
    }

    public void printFigure()
    {
        System.out.println("Rectangular:");
        System.out.print("  Bottom left coordinates: ");
        sq.printPoint();
        System.out.println("  Width and height are: " + sq.getWidth() + ", " + height);
    }
}