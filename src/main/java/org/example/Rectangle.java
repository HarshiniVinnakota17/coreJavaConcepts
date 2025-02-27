package org.example;

public class Rectangle {
    double width;
    double height;

    public Rectangle() {
    }

    void area() {
        System.out.println("area of the rectangle: "+ 2*width+height);
    }
    void perimeter(){
        System.out.println("perimeter of the rectangle:" + height*width);
    }

}
