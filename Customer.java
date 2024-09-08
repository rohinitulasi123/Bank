import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private final String customerId;
    private final List<BankAccount> accounts;

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public void displayAccounts() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Accounts for customer: " + name);
        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
        }
    }
    
}
