package oops.encapsulation;

public class Test {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", "123456789");
        // account.balance = 100; // this will throw an error no one can directly set
        // the balance
        // account.setAccountNumber("123456789"); // Directly set using constructor
        // account.setAccountHolderName("John Doe");
        account.deposite(-100);
        account.deposite(45.020);
        account.deposite(1000);
        account.withdraw(500);
        System.out.println(account.getBalance());
    }
}
