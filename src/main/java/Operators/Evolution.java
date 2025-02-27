package Operators;

import java.util.Scanner;

public class Evolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            if (age <= 5) {
                System.out.println(name + " is a toodler");
            } else if (age >= 6 && age <= 15) {

                System.out.println(name + " is a Child");
            } else if (age >= 16 && age <= 23) {

                System.out.println(name + " is a Youth");
            } else if (age >= 24 && age <= 60) {
                System.out.println(name + " is a Adult");
            } else if (age >= 61) {
                System.out.println(name + " is a Senior");
            }
            if (age<0 || age>100){
                System.out.println("End");
                break;
            }
        }
    }
}

