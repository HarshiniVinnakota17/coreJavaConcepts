package Comparisions;

import java.util.Scanner;



public class Maximum {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter num1 value: ");
            int num1 = sc.nextInt();
            System.out.print("Enter num2 value: ");
            int num2 = sc.nextInt();
            System.out.print("Enter num3 value: ");
            int num3 = sc.nextInt();


            int maximum = num1;

            if (num2 > maximum) {
                maximum = num2;
            } if (num3 > maximum) {
                maximum = num3;
            }

            System.out.println("Maximum Value is: " + maximum);


            //comparing max number in another way
//            if (num1 > num2 && num1 > num3) {
//                System.out.println("Maximum Value is: " + num1);
//            } else if (num2 > num3) {
//                System.out.println("Maximum Value is: " + num2);
//            } else {
//                System.out.println("Maximum Value is: " + num3);
//            }

            if (num1 > 1000 || num2 > 1000 || num3 > 1000) {
                System.out.println("Comparison Ends");
                break;
            }
        }
    }
}


