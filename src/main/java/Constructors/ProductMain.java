package Constructors;

public class ProductMain {

    public static void main(String[] args){
        Product P1 = new Product(44466, "Bananas", 30.0, 10);
        Product P2 = new Product(5533, "apples", 50.5, 20);
        P1.purchase(5);
        System.out.println(P1.getProductDetails());
        P2.restock(11);
        System.out.println(P2.getProductDetails());
        P1.purchase(33);
        System.out.println(P1.getProductDetails());
    }
}
