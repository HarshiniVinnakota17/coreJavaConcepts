package Constructors;

public class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    private  String department = "CSE";

    public Employee(int employeeId, String employeeName, double salary){
        this. employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }
    public String getAnnualSalary(){
        return  "salary: "+ salary*12;
    }
    public void applyBonus(double bonusPercentage) {
        if(bonusPercentage>0) {
            System.out.println("Bonus is added: " + bonusPercentage+"%");
            bonusPercentage = (salary * bonusPercentage) / 100;
            salary = salary + bonusPercentage;
            System.out.println(salary);
        }
    }
    public void transferDepartment(String newDepartment){
        //if(!department.equals(newDepartment)){
        //department = newDepartment;
        if(newDepartment == "ECE"){
            System.out.println("department is changed: " + newDepartment);
        }else{
            System.out.println("No change in department");
        }
    }
    public static void main(String []args){
        Employee E1 = new Employee(123, "Harshini", 10000);
        E1.getAnnualSalary();
        E1.applyBonus(10.0);
        E1.transferDepartment("ECE");
    }
}
