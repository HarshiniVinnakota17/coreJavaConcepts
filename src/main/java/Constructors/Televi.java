package Constructors;

public class Televi {

    public static void main(String[] args){
        Television T1 = new Television("Sony", 900000.0);
        Television T2 = new Television();
        Television T3 = new Television("Samsung",80000.0);
        T1.getBrand();
        T2.getBrand();
        T3.getBrand();
    }
}
