package Practice;

public class Student {

    public String name;
    public int rollNumber;

   public  Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public static void calculateAverage(float marks[]){
       float average = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
       if(average>=90){
           System.out.println(average + "is A grade");
       }else if(average<90){
           System.out.println(average + "is B grade");
       }

        System.out.println("Average of total marks: " + average);
    }
    public static void getGrade(float marks[]){
       for (int i = 0; i<marks.length; i++){
           if(marks[i]>=90){
               System.out.println(marks[i] + "is A grade");
           }else if(marks[i]>=80){
               System.out.println(marks[i] + "is B grade");
           }else if(marks[i]>=60 && marks[i]<70){
               System.out.println(marks[i] + " is C grade");
           }else if(marks[i]>=70){
               System.out.println(marks[i] + " is D grade");
           }else if(marks[i]<=60){
               System.out.println(marks[i] + " is F grade");
           }
       }
    }

    public static void main(String[] args) {
       float subject[] = new float[5];

        subject[0] = 35.3f;
        subject[1] = 65.7f;
        subject[2] = 77.6f;
        subject[3] = 82.9f;
        subject[4] = 92.3f;

        float sub1[] = new float[5];



        calculateAverage(subject);

        getGrade(subject);

    }
}

