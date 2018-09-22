package com.vertex.Sheremet.homework1;


import com.vertex.Sheremet.homework1.Market.MarketBlack;
import com.vertex.Sheremet.homework1.Market.MarketRed;
import com.vertex.Sheremet.homework1.Market.MarketWhite;
import com.vertex.Sheremet.homework1.Market.Marketed;

public class Teacher  {
    public Marketed getMarket (MarketTypes types){
        Marketed toReturn = null;
        switch (types) {
            case RED:
                toReturn = new MarketRed();
                break;
            case WHITE:
                toReturn = new MarketWhite();
                break;
            case BLACK:
                toReturn = new MarketBlack();
                break;
            default:
                throw new IllegalArgumentException("Wrong doughnut type:" + types);
        }
        return toReturn;
    }
}
