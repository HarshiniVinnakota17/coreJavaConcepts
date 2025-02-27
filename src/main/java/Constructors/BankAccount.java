package Constructors;

public class BankAccount {
    public String accountNumber;
    public double balance;
    public String accountHolderName;

    public BankAccount(String accountHolderName, double balance, String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }
    
    public void deposit(double amount){
        System.out.println(amount + " Dollars is deposited");
        balance = amount+balance;
        System.out.println("Current balance is: " + balance);

    }
    public void withdraw(double amount){
        System.out.println(amount + " Dollars is withdraw");
        balance = balance-amount;
        System.out.println("Current balance is: " + balance);
         if (balance<100){
             System.err.println("Insufficient funds.");
         }
    }
    public String getAccountDetails(){
        return "Account Holder: " + accountHolderName + "\nAccount Number: " + accountNumber + "\nBalance: " + balance;
    }

    public static void main(String[]args){
        BankAccount B1 = new BankAccount("Harshini", 500, "harshu12345");
        B1.deposit(100);
        System.out.println(B1.getAccountDetails());
        BankAccount B2 = new BankAccount("Rohith", 150,"rohith09867");
        B2.withdraw(100);
        System.out.println(B2.getAccountDetails());
    }
}
