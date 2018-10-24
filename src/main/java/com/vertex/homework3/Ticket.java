package com.vertex.homework3;

import java.util.Objects;

public class Ticket {
    private  int number;
    private  int plase;
    private  int line;
    private boolean prize;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPlase() {
        return plase;
    }

    public void setPlase(int plase) {
        this.plase = plase;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public boolean isPrize() {
        return prize;
    }

    public void setPrize(boolean prize) {
        this.prize = prize;
    }

    public Ticket(int number, int plase, int line, boolean prize) {
        this.number = number;
        this.plase = plase;
        this.line = line;
        this.prize = prize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket)) return false;
        Ticket ticket = (Ticket) o;
        return getNumber() == ticket.getNumber() &&
                getPlase() == ticket.getPlase() &&
                getLine() == ticket.getLine();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getNumber(), getPlase(), getLine());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ticket{");
        sb.append("number=").append(number);
        sb.append(", plase=").append(plase);
        sb.append(", line=").append(line);
        sb.append(", prize=").append(prize);
        sb.append('}');
        return sb.toString();
    }
}
