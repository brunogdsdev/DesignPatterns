package Observer.Observer01;

import Observer.Observer01.domain.Bitcoin;

public class Oberver01Main {
    public static void main(String[] args) {
        Bitcoin bitcoin = new Bitcoin();

        bitcoin.addObserver(new BitcoinPriceLogger());
        bitcoin.addObserver(new InvestorNotify());
        bitcoin.addObserver(new NewsPlatform());

        bitcoin.setPrice(10.2f);
    }
}
