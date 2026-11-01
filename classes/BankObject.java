package classes;

public class BankObject {
    public static void main(String[] args) {
        //logic to collect user input and create a BankAccount object
        //inputs
        String accountHolderName = "John Doe";
        String accountNumber = "123456789";
        double initialBalance = 1000.0;
        BankAccount account = new BankAccount(accountHolderName, Integer.parseInt(accountNumber), initialBalance);
        account.checkBalance();
        account.deposit(500.0);
        account.withdraw(200.0);
        account.checkBalance();
    }
}
