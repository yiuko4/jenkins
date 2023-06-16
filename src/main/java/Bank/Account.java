package Bank;

public class Account {
    private String accountId;
    private double balance;
    private double interestRate;

    public Account(String accountId, double balance, double interestRate) {
        this.accountId = accountId;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void transfer(Account destinationAccount, double amount) {
        if (amount <= balance) {
            balance -= amount;
            destinationAccount.deposit(amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double calculateInterest() {
        return balance * interestRate;
    }
}
