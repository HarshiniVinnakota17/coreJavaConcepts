package Arrays;

public class studentMarks {

    public String name;
    public int marks;

    public studentMarks (String name, int marks){
        this.marks=marks;
        this.name=name;
    }
    //print the average sum of an array
    public static void calculate(int marks[]){
        int sum = marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
        int average = sum/5;

        if(average>=40){
            System.out.println("pass: " + average);
        } else {
            System.out.println("fail: " + average);

        }
    }

    //print the max number
    public static void Max(int marks[]){
        int temp = 0;
        for(int i =0; i<marks.length; i++){
            if(marks[i]>temp) {
                temp = marks[i];

            }
        }
        System.out.println("print max value: " + temp);
    }

    //print even or odd numbers from an array
    public static void evenOdd(int marks[]){
        for(int i=0; i<marks.length;i++){
            if(marks[i]%2==0) {
                System.out.println("print even numbers: " + marks[i]);
            }else {
                System.out.println("print odd number: " + marks[i]);
            }
        }
    }

    //reverse of an array
    public static void reverse(int marks[]){
        for(int j=marks.length-1; j>=0; j--){
            System.out.println(marks[j]);
        }
    }

    public static void Min(int marks[]){
        int temp = marks[0];
        for(int i=0; i<marks.length; i++){
            if(temp>marks[i]){
                temp = marks[i];

            }
        }
        System.out.println("print Min value: " + temp);
    }

    public static void main(String[] args) {
        int marks[] = new int [5];
        marks[0]=55;
        marks[1]=33;
        marks[2]=78;
        marks[3]=23;
        marks[4]=40;

//        calculate(marks);
//        Max(marks);
//        Min(marks);
//        evenOdd(marks);
        reverse(marks);

    }
}
