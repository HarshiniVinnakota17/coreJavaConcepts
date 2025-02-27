public class Student {
  private  int id;
  private  String name;
   float marks;

   public int getID(){
       return id;
   }
   public String getName(){
       return name;
   }
   public float getmarks(){
       return marks;
   }
   public Student(int id, String name, float marks){
       this.id = id;
       this.name = name;
       this.marks = marks;
   }
   public Student (int id, String name){
       this.name = name;
       this.id = id;
   }

}
