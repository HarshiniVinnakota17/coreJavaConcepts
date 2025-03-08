package Arrays;

public class Clothing {

    public int price;
    public int  size = 5;
    String name ;


    public String customer = "c1";

    public void totalPrice(int[] items){
        int sum=0;
        for( int  c : items){
            if(c==size){
                sum += c;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int items [] = new int[3];

        items [0] = 5;
        items [1] = 5;
        items [2] = 3;

        Clothing c = new Clothing();
        c.totalPrice(items);
    }

}
