package org.designpatterns.strategy.exemplo1;

public class NewDiscount extends DiscountStrategy{
    protected int discount = 0;

    public double getDiscount(ECommerceShoppingCart cart){
        double total = cart.getTotal();

        if(total >= 50){
            this.discount = 5;
        }

        return total - total * (this.discount / 100.0);
    }
}
