package Composite.Composite01;

public class CompositeMain01 {
    public static void main(String[] args) {
        ProductLeaf camiseta = new ProductLeaf("Camiseta", 40);
        ProductLeaf carro = new ProductLeaf("Carro", 100);
        ProductLeaf bike = new ProductLeaf("Bike", 40_000);


        ProductComposite productBox = new ProductComposite();
        productBox.add(bike);
        productBox.add(carro);
        productBox.add(camiseta);

        ProductLeaf kindle = new ProductLeaf("Kindle", 401);
        ProductLeaf tablet = new ProductLeaf("tablet", 800);

        ProductComposite productBox2 = new ProductComposite();
        productBox2.add(kindle);
        productBox2.add(tablet);


        productBox.add(productBox2);


        System.out.println("Box:"+productBox.getPrice());
        System.out.println("Carro: "+carro.getPrice());
    }
}
