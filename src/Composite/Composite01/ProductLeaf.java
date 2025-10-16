package Composite.Composite01;

public class ProductLeaf extends ProductComponent {
    private String name;
    private int price;

    public ProductLeaf(String newName, int newPrice){
        super();
        this.name = newName;
        this.price = newPrice;
    }

    int getPrice(){
        return this.price;
    }


}
