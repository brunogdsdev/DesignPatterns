package Observer.Observer01;

public class BitcoinPriceLogger extends BitcoinPriceObserver {
    @Override
    public void update(float price){
        System.out.println("UPDATE BITCOIN PRICE LOGGER");
    }

}
