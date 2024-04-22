package Exc1;

public class BankSystem {
    public static void main(String[] args) {
        Customer customer = new Customer("Anna", " 068888888", " 30D");

        Account account = new CurrentAccount(customer, "1", 1500, 100);

        account.deposit(1000);
        account.withdraw(300);
        account.generateData();

    }
}

