package org.designpatterns.strategy.exemplo1;

import java.util.ArrayList;
public class ECommerceShoppingCart {
    private ArrayList<ECommerceProductProtocol> products = new ArrayList<>();
    private DiscountStrategy discountStrategy = new DiscountStrategy();

    public ECommerceShoppingCart(DiscountStrategy discount){
        this.discountStrategy = discount;
    }

    public void setDiscount(DiscountStrategy discount){
        this.discountStrategy = discount;
    }

    public void addProducts(ECommerceProductProtocol product ){
        this.products.add(product);
    }

    public ArrayList<ECommerceProductProtocol> getProducts(){
        return this.products;
    }

    public double getTotal(){
        double total = 0;
        for(ECommerceProductProtocol product : this.products){
            total += product.getPrice();
        }
        return total;
    }

    public double getTotalWithDiscount(){
        return this.discountStrategy.getDiscount(this);
    }
}
