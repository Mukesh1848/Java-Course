package oops.encapsulation;

public class BankAccount {
    // private the data members to meet the encapsulation
    private double balance;
    private String accountNumber;
    private String accountHolderName;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void deposite(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to account holder " + accountHolderName);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from account holder " + accountHolderName);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        return accountHolderName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}

// Encapsulation is the process of bundling data (variables) and methods
// (functions) that operate on that data into a single unit called a class. It
// also restricts direct access to some of the object’s components, which helps
// in protecting the integrity of the data.

// Real-World Example:
// Think of a bank account. You cannot directly access the account balance.
// Instead, you use ATMs or online banking to interact with your account through
// specific operations like deposit or withdraw.

// The bank account details (balance, account number) are hidden.
// The ATM or banking system provides a controlled interface to access and
// modify that data.
// Encapsulation ensures that data remains secure and is only modified in
// controlled ways.