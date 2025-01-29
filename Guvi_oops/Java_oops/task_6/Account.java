package task_6;

public class Account {
    
    private int accountNumber;
    private double balance;

    // No-argument constructor
    public Account() {
        this.accountNumber = 0;
        this.balance = 0.0;
    }

    // Constructor with arguments
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter method for accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        // Create an Account object using the no-argument constructor
        Account account1 = new Account();
        account1.deposit(1000);
        account1.withdraw(500);
        account1.checkBalance();

        // Create an Account object using the constructor with two arguments
        Account account2 = new Account(12345, 2000);
        account2.deposit(500);
        account2.withdraw(1000);
        account2.checkBalance();
    }
}

