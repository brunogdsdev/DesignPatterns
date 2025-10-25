package org.designpatterns.strategy.exemplo1;

public class ECommerceProductProtocol {
    private String name = "";
    private int  price = 0;

    public ECommerceProductProtocol(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }
}
