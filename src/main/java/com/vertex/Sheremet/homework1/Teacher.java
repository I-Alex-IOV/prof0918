package HomeWork1;

import HomeWork1.Market.*;

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
