package HomeWork1;

import HomeWork1.Market.Marketed;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        Marketed red = teacher.getMarket(MarketTypes.RED);
        Marketed white = teacher.getMarket(MarketTypes.WHITE);
        Marketed black = teacher.getMarket(MarketTypes.BLACK);

        red.write();
        white.write();
        black.write();
    }
}
