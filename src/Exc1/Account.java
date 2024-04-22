package Exc1;

public class Account {
    private Customer customer;
    private String accountNumber;
    protected double balance;

    public Account(Customer customer, String accountNumber, double balance) {
        this.customer = customer;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("На счету недостаточно средств ");
            return false;
        }
    }
    public void generateData () {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Balance: " + balance);
    }
}


