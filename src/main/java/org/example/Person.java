package org.example;

public class Person {
    String name = "harshini";
    private final int age = 26;
    String address = "12330 research rd, frisco, texas-75034";

    public void displayDetails(){

        System.out.println("Name: " + name + "\n" +"Age: " + age+ "\n" + "Address: " + address);
    }

    public static void main(String[] args){
        Person person =new Person();

        person.displayDetails();
        int a = person.PersonAge();

        if(a>25){
            System.out.println("Aunty");
        }
    }
    public int PersonAge(){
        return age;
    }


}
