package org.designpatterns.strategy.exemplo1;

public class DiscountStrategy {
    int discount;
     public double getDiscount(ECommerceShoppingCart cart){
         return cart.getTotal();
     }
}
