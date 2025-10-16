package Observer.Observer01;

public class InvestorNotify extends BitcoinPriceObserver{
    @Override
    public void update(float price){
        System.out.println("UPDATE INVESTOR NOTIFY");
    }
}
