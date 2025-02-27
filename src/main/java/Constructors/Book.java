package Constructors;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private  boolean isAvailable;

    public Book(int bookId, String title, String author, boolean isAvailable){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.isAvailable=isAvailable;
    }
    public Book(String author, boolean isAvailable){
        this.author=author;
        this.isAvailable=isAvailable;
    }
    public Book(){

    }
    public void checkOutBook(){
        if(!isAvailable){
            System.out.println("book checked out successfully");
        }else{
            System.out.println("Book is already checked out.");
        }
    }
    public void returnBook(){
        if (isAvailable){
            System.out.println("book returned successfully");
        }else{
            System.out.println("book was not checked out");
        }
    }
    public String getBookInfo(){

        return "title: " + title + " bookId: "+ bookId  +  " author: "+ author + "Available: " + (isAvailable? "Yes" : "No");
    }
}
