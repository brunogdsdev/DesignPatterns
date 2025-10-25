package org.designpatterns.strategy.exemplo1;

public class StrategyMain {
    public static void main(String[] args) {
        ECommerceShoppingCart shoppingCart = new ECommerceShoppingCart(new DiscountStrategy());

        ECommerceProductProtocol p1 = new ECommerceProductProtocol("Produto 1", 50);
        ECommerceProductProtocol p2 = new ECommerceProductProtocol("Produto 2", 50);
        ECommerceProductProtocol p3 = new ECommerceProductProtocol("Produto 3", 50);

        shoppingCart.addProducts(p1);
        shoppingCart.addProducts(p2);
        shoppingCart.addProducts(p3);

        System.out.println("TOTAL COM DESC.:"+shoppingCart.getTotalWithDiscount());
        System.out.println("TOTAL:"+shoppingCart.getTotal());
    }
}
