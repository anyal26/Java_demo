package Exc1;

class CurrentAccount  extends Account {
    private double withdravalLimit;

    public CurrentAccount (Customer customer, String accountNumber, double balance, double withdravalLimit) {
        super(customer, accountNumber, balance);
        this.withdravalLimit = withdravalLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance + withdravalLimit >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Превышение лимита");
            return false;
        }
    }
}

