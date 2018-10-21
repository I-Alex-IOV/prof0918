package com.vertex.homework3;

import java.util.Comparator;
import java.util.Objects;

public class Lissiner {
    private String name;
    private String sex;
    private double mustacheLength;
    private int numberOfBrooches;



    public Lissiner(String name, String sex, double mustacheLength) {
        this.name = name;
        this.sex = sex;
        this.mustacheLength = mustacheLength;
    }
    public Lissiner(String name, String sex, int numberOfBrooches) {
        this.name = name;
        this.sex = sex;
        this.numberOfBrooches = numberOfBrooches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getMustacheLength() {
        return mustacheLength;
    }

    public void setMustacheLength(double mustacheLength) {
        this.mustacheLength = mustacheLength;
    }

    public int getNumberOfBrooches() {
        return numberOfBrooches;
    }

    public void setNumberOfBrooches(int numberOfBrooches) {
        this.numberOfBrooches = numberOfBrooches;
    }


    public static Comparator<Lissiner> comparator = new Comparator<Lissiner>(){

        @Override
        public int compare(Lissiner o1, Lissiner o2) {
            return  (int) (o2.getNumberOfBrooches() - o1.getNumberOfBrooches());
        }

    };
    public static Comparator<Lissiner> comparator1 = new Comparator<Lissiner>(){

        @Override
        public int compare(Lissiner o1, Lissiner o2) {
            return (int) (o2.getMustacheLength() - o1.getMustacheLength());
        }

    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lissiner)) return false;
        Lissiner lissiner = (Lissiner) o;
        return Double.compare(lissiner.getMustacheLength(), getMustacheLength()) == 0 &&
                getNumberOfBrooches() == lissiner.getNumberOfBrooches() &&
                Objects.equals(getName(), lissiner.getName()) &&
                Objects.equals(getSex(), lissiner.getSex());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getSex(), getMustacheLength(), getNumberOfBrooches());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Lissiner{");
        sb.append("name='").append(name).append('\'');
        sb.append(", sex='").append(sex).append('\'');
        sb.append(", mustacheLength=").append(mustacheLength);
        sb.append(", numberOfBrooches=").append(numberOfBrooches);
        sb.append('}');
        return sb.toString();
    }



}


