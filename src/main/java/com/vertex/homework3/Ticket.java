package com.vertex.homework3;

public class Ticket {
    private int row;
    private int seat;
    private int number;
    public Ticket(int row,int seat,int number){
        this.row=row;
        this.seat=seat;
        this.number=number;
    }
    public int getRow(){
        return row;
    }
    public int getSeat(){
        return seat;
    }
    public int getNumber(){
        return number;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ticket{");
        sb.append("row='").append(row).append('\'');
        sb.append(", seat='").append(seat).append('\'');
        sb.append(", number=").append(number);
        sb.append('}');
        return sb.toString();
    }

}
