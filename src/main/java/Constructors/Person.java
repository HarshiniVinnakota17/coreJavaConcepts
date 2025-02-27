package Constructors;

public class Person {
    public String name;
    public int age;
    public boolean isEmployed;

    public Person(){

    }
    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }
    public Person(boolean isEmployed){
        this.isEmployed = isEmployed;
    }
        public void displayInfo(){
        System.out.println("The name of the Person is: " + name);
        System.out.println("The name of the age is: " + age);
            if (age>65){
                System.out.println(name + " Eligible for retirement");
            }
    }
    public void updateEmploymentStatus(){
    }

    public static void main (String[]args){
        Person p1 = new Person("Harshini", 26);
        p1.displayInfo();
        Person p2 = new Person("Vineetha", 70);
        p2.displayInfo();
        Person p3 = new Person(true);
        p3.updateEmploymentStatus();
    }
}
