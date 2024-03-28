package Homework;

public class BankAccount {
    public static void main(String[] args) {
    }
    String account_number;
    double balance;

    public void deposit(double amount) {
        balance = balance + amount;
    }
    public void withdraw (double amount) {
        balance = balance - amount;


    }
}


