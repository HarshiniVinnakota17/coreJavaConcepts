package Comparisions;


class Test {

    //default
    public Test() {
        System.out.println("Hello Test");
    }
}
class Dummy extends Test {

   //default
    public Dummy() {
        System.out.println("Hello Dummy");
    }
}



public class ConstructorPractice {

    public static void main (String[] args){
        Test test = new Dummy();


    }
}
