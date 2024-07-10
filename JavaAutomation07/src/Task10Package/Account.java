package Task10Package;

public class Account {

	private double balance;

	public Account() {// with no arguments

		balance = 0.0; // Default balance
	}

	public Account(double initialBalance) { // one argument

		balance = initialBalance;
	}

	public void withdraw(double amount) { // withdraw from the account
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal successful. New balance: " + balance);
		} else {
			System.out.println("Withdrawal failed. Insufficient funds.");
		}
	}

	public void deposit(double amount) { // deposit into the account
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit successful. New balance: " + balance);
		} else {
			System.out.println("Deposit failed. Invalid amount.");
		}
	}

	public double getBalance() { // Getter method for balance
		return balance;
	}

}
