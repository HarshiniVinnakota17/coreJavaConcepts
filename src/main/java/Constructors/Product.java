package Constructors;

public class Product {
    private int productId;
    private String productName;
    public double price;
    public int quantity;

    public Product(int productId, String productName, double price, int quantity){
        this. productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public void calculateTotalCost(){
        double totalcost = (int) (price*quantity);
        System.out.println(totalcost);
    }
//    public double calculateTotalCost(){
//        return price*quantity;
//    }
    public void updateQuantity(int newQuantity) {
        quantity = newQuantity;
        System.out.println("Updated quantity is: " + quantity);
        if(newQuantity<=0){
            System.out.println("Invalid quantity");
        }else
            System.out.println("Valid quantity.");

    }
    public static void main(String[] args){
        Product p1 = new Product(123, "coffee", 50.0, 20);
        p1.calculateTotalCost();
//        double totalcost = p1.calculateTotalCost();
//        System.out.println(totalcost);
        p1.updateQuantity(40);
        p1.updateQuantity(-10);
    }
}
