package com.vertex.homework3_4;

import java.util.Objects;

public class Ticket {

    private int id;
    private static int increment;
    private int rowNumber;
    private  int placeNumber;
    private boolean isWinner = false;

    Ticket(int rowNumber, int placeNumber) {
        increment++;
        id =  increment;
        this.rowNumber = rowNumber;
        this.placeNumber = placeNumber;
    }

    void setWinner(boolean isWinner) {
        this.isWinner = isWinner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return  placeNumber == ticket.placeNumber &&
                rowNumber == ticket.rowNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, placeNumber, rowNumber);
    }

    @Override
    public String toString() {
        return '\n' + "Ticket number: " + id + ", row: " + rowNumber + ", place: " + placeNumber;
    }
}
