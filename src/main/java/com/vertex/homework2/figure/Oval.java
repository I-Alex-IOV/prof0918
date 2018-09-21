package com.vertex.homework2.figure;

import java.util.Objects;

public class Oval implements Figure {
    private final String name;
    private final int width;
    private final int height;

    private Oval(final OvalBuilder ovalBuilder) {
        this.name = ovalBuilder.getName();
        this.width = ovalBuilder.getWidth();
        this.height = ovalBuilder.getHeight();
    }

    public static class OvalBuilder {
        private String name;
        private int heigth;
        private int width;

        public OvalBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public OvalBuilder width(final int width) {
            this.width = width;
            return this;
        }

        public OvalBuilder height(final int height) {
            this.heigth = height;
            return this;
        }

        public String getName() {
            return name;
        }

        public int getWidth() {

            return width;
        }

        public int getHeight() {
            return heigth;
        }

        public Oval build() {
            return new Oval(this);
        }
    }


    @Override
    public void showFigure(Point point) {
        System.out.println("Show com.cameramnet1.figure.Oval with point " + point.getX() + "," + point.getY() + " height  =" + height + " width =" + width);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("com.cameramnet1.figure.Oval{");
        sb.append("name='").append(name).append('\'');
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Oval)) return false;
        if (!super.equals(o)) return false;
        Oval oval = (Oval) o;
        return width == oval.width &&
                height == oval.height &&
                Objects.equals(name, oval.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), name, width, height);
    }
}

