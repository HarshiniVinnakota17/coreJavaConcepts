package Arrays;

public class Car {
    String brand;
    String model;
    int year;
    String colour;


    //modifyed the class and added the constructor here
    public Car(String brand, String model, int year){
        this.brand =  brand;
        this.model = model;
        this.year = year;

    }
    //added one more consturctor with single parameter
    public Car(String colour){
        this.colour = colour;

    }

    //added display car details method and calling in the below main method
    public void displayCarDetails(){
        System.out.println("Car Brand is:" + brand + ", " + "Car Model is:" + model + ", " + "Car Year is:" + year);


    }
    public void displayCarColour(){
        System.out.println("Car Colour is: " + colour);
    }

    public void isVintageCar(){
        if(year<2000){
            System.out.println("This car is Vintage Car");
        }else {
            System.out.println("This car is New Model Car");
        }
    }

    //added main methodand assigned the car details and calling in the display car details method
    public static void main (String[]args){
        Car car = new Car("Scross", "s3324", 2025);
        car.displayCarDetails();
        car.isVintageCar();

        //added one more object
        Car car1 = new Car("Red");
        car1.displayCarColour();

        Car[] car2 = new Car[1];
        car2[0] = new Car("maruti", "444", 2021);
        car2[0].displayCarDetails();


    }
}
