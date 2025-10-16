package Observer.Observer01.domain;

import Observer.Observer01.BitcoinPriceObserver;

import java.util.ArrayList;

public class Bitcoin {
    private float price = 0;
    private ArrayList<BitcoinPriceObserver> observables = new ArrayList<BitcoinPriceObserver>();

    public void addObserver(BitcoinPriceObserver observer){
        this.observables.add(observer);
    }

    public void notifyObservers(){
        for(BitcoinPriceObserver observer : observables){
            observer.update(this.price);
        }
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if(this.price != price){
            this.price = price;
            this.notifyObservers();
        }
    }
}
