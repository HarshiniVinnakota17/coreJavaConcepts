package Constructors;

public class Television {

    private String brand;
    private int model;
    private double price;

    public  Television (String brand, int model){
        this.brand=brand;
        this.model=model;
    }
    public Television() {

    }
    public Television( String brand, double price) {
        this.brand = brand;
        this.price = price;
    }


    public String getBrand(){
        if(price>50000.0){
            System.out.println("The television brand name is: " + brand);
        }
        return brand;
    }
    public int getModel(){
        return model;
    }
    public double getPrice(){
        return price;
    }
}
