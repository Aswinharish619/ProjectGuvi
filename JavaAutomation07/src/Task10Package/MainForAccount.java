package Task10Package;

public class MainForAccount {

	public static void main(String[] args) {
		Account account1 = new Account(); // account with default balance
        System.out.println("Initial balance for account1: " + account1.getBalance());

        Account account2 = new Account(1000.0); // account with initial balance 1000.0
        System.out.println("Initial balance for account2: " + account2.getBalance());

        // Withdrawal and deposit operations
        account1.deposit(500.0);
        account2.withdraw(200.0);

        System.out.println("Final balance for account1: " + account1.getBalance());
        System.out.println("Final balance for account2: " + account2.getBalance());
    }

}
