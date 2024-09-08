public class BankApplication {
    public static void main(String[] args) {
        // Create a new customer
        Customer customer = new Customer("John Doe", "C12345");

        // Create new bank accounts
        BankAccount account1 = new BankAccount("A1001", 1000.0);
        BankAccount account2 = new BankAccount("A1002", 500.0);

        // Add accounts to the customer
        customer.addAccount(account1);
        customer.addAccount(account2);

        // Display customer accounts
        customer.displayAccounts();

        // Perform some transactions
        account1.deposit(200.0);
        account1.withdraw(150.0);
        account2.withdraw(600.0); // Should show an error due to insufficient funds

        // Check balances after transactions
        customer.displayAccounts();
    }
}
