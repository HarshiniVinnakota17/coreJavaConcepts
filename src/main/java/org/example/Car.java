package org.example;

public class Car {

    //Instance variables
    String make = "Audi";
    int model = 34343;
    int year = 2015;
    int currentYear = 2024;
    int age;
    static int numberOfWheels = 4;

    public static void main(String[] args) {
        //object
        Car car = new Car();
        //printing variables
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(numberOfWheels);
        car.detailsOfCar();
        car.startEngine();
        car.calculateAge();

    }
        public void detailsOfCar() {
            //local variable (within method) by default it is non-static
            String colour = "red";
            System.out.println(colour);
    }

    public void startEngine(){
        System.out.println("The engine has started.");
    }
    public void calculateAge(){
        age = currentYear-year;
        System.out.println("print age of the car: " + age );
    }
}

//if variables are static we can directly access anywhere in the classe they are not static we need to use by creating obeject.
//the below given by chatgpt
//
//public class Car {
//
//    // Instance variables
//    String make;
//    int model;
//    int year;
//
//    // Constructor to assign values to the variables
//    public Car(String make, int model, int year) {
//        this.make = make;
//        this.model = model;
//        this.year = year;
//    }
//
//    public static void main(String[] args) {
//        // Creating a Car object using the constructor
//        Car car = new Car("Audi", 34343, 2024);
//
//        // Printing instance variables
//        System.out.println("Make: " + car.make);
//        System.out.println("Model: " + car.model);
//        System.out.println("Year: " + car.year);
//    }
//}