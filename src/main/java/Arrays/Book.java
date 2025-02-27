package Arrays;

public class Book {
   public String title;
    public String author;
   public double price;

   public Book(String title, String author, double price){
       this. title = title;
       this.author = author;
       this.price = price;
   }
   public static void displayDetails(String author[], String title[], double price[]){
       System.out.println("Author of the Book: " + author[0] + ", " + "Title of the book: " + title[0]+ ", " + "Price of the book: " + price[0]);
       System.out.println("Author of the Book: " + author[1] + "," + "Title of the book: " + title[1]+ ", "  + "Price of the book: " + price[1]);
       System.out.println("Author of the Book: " + author[2]+ ", "  + "Title of the book: " + title[2]+ ", "  + "Price of the book: " + price[2]);
       System.out.println("Author of the Book: " + author[3]+ ", "  + "Title of the book: " + title[3]+ ", "  + "Price of the book: " + price[3]);
       System.out.println("Author of the Book: " + author[4]+ ", "  + "Title of the book: " + title[4]+ ", "  + "Price of the book: " + price[4]);


   }

    public static void main(String[] args) {
        String author[]= new String[5];
        author[0]= "Rohith";
        author[1] = "Vineetha";
        author[2] = "Bhavana";
        author[3] = "Harshini";
        author[4] = "Praveen";

        String title[] = new String[5];
        title[0] = "Rohith's Bio Book";
        title[1] = "Vineetha's Bio Book";
        title[2] = "Bhavan's Bio Book";
        title[3] = "Harshini's Bio Book";
        title[4] = "Praveen's Bio Book";

        double price[] = new double[5];
        price[0] = 88.5d;
        price[1] = 56.7d;
        price[2] =90.5d;
        price[3] = 40.6d;
        price[4] = 77.6d;

        displayDetails(author, title, price);
    }
}
