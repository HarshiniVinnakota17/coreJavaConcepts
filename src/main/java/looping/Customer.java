package looping;

public class Customer {

    public String size;



    public static void main(String[] args) {
        Customer c1 = new Customer();

        int measurement = 3;
        switch(measurement){
            case 3:
                c1.size = "S";
            case 6:
                c1.size = "M";
            case 9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
        }

        System.out.println(c1.size);

    }
}
