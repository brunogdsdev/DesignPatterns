package Observer.Observer01;

public class NewsPlatform extends BitcoinPriceObserver{

    @Override
    public void update(float price){
        System.out.println("UPDATE NEWS PLATFORM");
    }
}
