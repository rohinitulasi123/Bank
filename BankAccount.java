
public class BankAccount {

    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Get account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: $" + amount);
            } else {
                System.out.println("Insufficient funds. Withdrawal amount exceeds balance.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}
