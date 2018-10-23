package com.vertex.homework2.figure.implementation;

import com.vertex.homework2.figure.Point;

public class Oval extends AbstractFigure {

    private Circle preparetionOval;
    private double radiusLitle;

    public Oval(){}

    public Oval(Circle preparetionOval, double radiusLitle){
        this.preparetionOval = preparetionOval;
        this.radiusLitle = radiusLitle;
    }

    public static class BuilderOval{

        private Oval oval;

        public BuilderOval(){

            oval = new Oval();

        }

        public BuilderOval withRadiusLitle (double radiusLitle){
            oval.radiusLitle = radiusLitle;
            return this;
        }
        public BuilderOval withPreparetionOval(Circle preparetionOval){
            oval.preparetionOval = preparetionOval;
            return this;
        }
        public Oval build(){return new Oval(oval.preparetionOval, oval.radiusLitle);}

    }

    public void drawOvalHorizontal(){
        System.out.print( " Oval location - horizontal ");
        draw();
    }
    public void drawOvalVertical(){
        System.out.print( " Oval location - vertical ");
        draw();
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Oval{" +
                "preparetionOval=" + preparetionOval +
                ", radiusLitle=" + radiusLitle +
                '}';
    }
    public static void main(String[] args) {
        BuilderOval builder = new BuilderOval()
                .withPreparetionOval(new Circle(new Point(Math.floor(Math.random()*100)/10, Math.floor(Math.random()*100)/10),Math.floor(Math.random()*50+1)/10))
                .withRadiusLitle( Math.floor(Math.random()*20+1)/10);

        Oval oval = builder.build();

        oval.draw();
        oval.drawOvalHorizontal();
        oval.drawOvalVertical();




    }
}

