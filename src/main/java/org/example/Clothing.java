package org.example;

public class Clothing {

    public double price;

    public Clothing(double price ){
        this.price = price;
    }

    public static void main(String[] args) {
        Clothing item1 = new Clothing(100);
        Clothing item2 = new Clothing(50);

        double taxRate = 44.5;

        double total = item2.price+item2.price+item1.price *taxRate;

        System.out.println(total);
    }
}
