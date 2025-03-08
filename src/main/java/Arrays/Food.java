package Arrays;

public class Food {

    public String foodName;
    public int prices;

    public Food(String foodName, int prices) {
        this.foodName = foodName;
        this.prices = prices;
    }

    //printing the large second number.
    public static void Foodprices(int prices[]) {
        int temp = 0;
        int temp1 = 0;
        for (int i = 0; i < prices.length; i++) {
            if (temp1 < prices[i]) {
                temp = temp1;
                temp1 = prices[i];
            }
        }
        System.out.println(temp);
    }

    //reverse an array
    public static void reverse(int prices[]) {
        for (int i = prices.length - 1; i >= 0; i--) {
            System.out.println(prices[i]);
        }
    }

    //sum all numbers
    public static void sum(int prices[]){
        int add=1;
        for(int i=0; i<prices.length; i++){
            add = add * prices[i];
        }
        System.out.println(add);
    }


    public static void main(String[] args) {
        int prices[] = new int[5];
        prices[0] = 15;
        prices[1] = 5;
        prices[2] = 20;
        prices[3] = 30;
        prices[4] = 40;

        Foodprices(prices);
        reverse(prices);
        sum(prices);
    }
}
