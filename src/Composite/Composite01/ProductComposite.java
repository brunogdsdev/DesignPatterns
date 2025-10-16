package Composite.Composite01;

import java.util.ArrayList;

public class ProductComposite extends ProductComponent{
    private ArrayList<ProductComponent> children = new ArrayList<ProductComponent>();

    void add(ProductComponent product){
        this.children.add(product);
    }
    void remove(ProductComponent product){
        int productIndex = this.children.indexOf(product);

        if(productIndex > 0){
            this.children.remove(productIndex);
        }
    }

    int getPrice(){
        int sum = 0;

        for(ProductComponent child : children){
            sum += child.getPrice();
        }

        return sum;
    }
}
