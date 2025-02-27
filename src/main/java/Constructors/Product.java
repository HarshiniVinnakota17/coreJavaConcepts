package Constructors;

public class Product {
    private  int productId;
    private String name;
    private double price;
    private int stock;

    public Product(int productId, String name, double price, int stock){
        this.productId=productId;
        this.name=name;
        this.price=price;
        this.stock=stock;
    }
    public void purchase(int quantity){
        if (stock<quantity){
            System.out.println("Not enough stock available - " + quantity + " " + name);
        }else{
            stock -=quantity;
            System.out.println("Please collect the stock at front desk - " + quantity + " " + name);
        }
    }
    public  void restock(int quantity){
        stock +=quantity;
        System.out.println("Stock is available - " + stock + " " + name);
    }
    public String getProductDetails(){
        return "Name: " + name + " ProductId: " + productId + " Price: " + price + " Available Stock: " + stock;
    }
}
