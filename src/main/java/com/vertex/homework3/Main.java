package com.vertex.homework3;


public class Main {
    public static void main(String[] args) {
        for (int i=0;i<8;i++){
            System.out.println(Spectator.getQueue().poll());
        }
        CashBox cashBox=new CashBox(2,4);
        System.out.println(cashBox.getOwners());

    }



}
