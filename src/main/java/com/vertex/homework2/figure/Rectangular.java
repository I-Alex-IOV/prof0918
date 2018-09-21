package com.vertex.homework2.figure;

import java.util.Objects;

public class Rectangular implements Figure {
    private final String name;
    private final int widthRectangular;
    private final int heightRectangular;

    private  Rectangular(final  RectangularBuilder rectangularBuilder){
        this.name=rectangularBuilder.getName();
        this.heightRectangular = rectangularBuilder.getHeightRectangular();
        this.widthRectangular = rectangularBuilder.getWidthRectangular();
    }
    public static class  RectangularBuilder {
        private  String name;
        private  int widthRectangular;
        private  int heightRectangular;

        public RectangularBuilder name(final String name){
            this.name =name;
            return this;
        }

        public String getName() {
            return name;
        }
        public RectangularBuilder widthRectangular(final int widthRectangular){
            this.widthRectangular=widthRectangular;
            return this;
        }

        public int getWidthRectangular() {
            return widthRectangular;
        }
        public RectangularBuilder heightRectangular(final int heightRectangular){
            this.heightRectangular = heightRectangular;
            return this;
        }

        public int getHeightRectangular() {
            return heightRectangular;
        }
        public Rectangular build(){
            return new Rectangular(this);
        }
    }

    @Override
    public void showFigure(Point point) {
        System.out.println("Show com.cameramnet1.figure.Rectangular with point "+point.getX()+","+point.getY()+"  widthRectangular ="+widthRectangular+" heightRectangular ="+heightRectangular);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangular{");
        sb.append("name='").append(name).append('\'');
        sb.append(", widthRectangular=").append(widthRectangular);
        sb.append(", heightRectangular=").append(heightRectangular);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangular)) return false;
        Rectangular that = (Rectangular) o;
        return widthRectangular == that.widthRectangular &&
                heightRectangular == that.heightRectangular &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, widthRectangular, heightRectangular);
    }
}


