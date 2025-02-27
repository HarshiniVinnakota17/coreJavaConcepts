package Constructors;

public class BookMain {

    public static void main(String[]args){
        Book B1 = new Book(1234, "HarshuBIO", "Harshini", true);
        Book B2 = new Book();
        Book B3 = new Book("Rohith", false);
        B1.checkOutBook();
        System.out.println(B1.getBookInfo());
        B1.returnBook();
        System.out.println(B1.getBookInfo());
        B3.checkOutBook();
        System.out.println(B3.getBookInfo());

    }
}
