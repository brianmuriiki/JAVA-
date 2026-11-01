package classes;

public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    //constructor
    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //methods
    //deposit method
    public void deposit(double amount) {
       if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    //withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    //check balance method
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
    
}
