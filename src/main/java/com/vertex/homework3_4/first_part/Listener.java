package com.vertex.homework3_4.first_part;

public class Listener {

    private String name;
    private int priority;
    private boolean sex;
    private int numberOfTickets;

    public Listener(String name, int priority, boolean sex, int numberOfTickets) {
        this.name = name;
        this.priority = priority;
        this.sex = sex;
        this.numberOfTickets = numberOfTickets;
    }

    public int getPriority() {
        return priority;
    }

    public boolean getSex() {
        return sex;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    @Override
    public String toString() {
        return (sex ? "Man, mustaches length: " + priority + "sm" : "Woman, number of brooches: " + priority ) +
                ", name: " + name;
    }
}
