package Exc3;

public class Manager extends Employee{
    private double bonus;

    public Manager( String name, double hourPay, double bonus ) {
        super (name,hourPay);
        this.bonus = bonus;
    }

    @Override
    public double calculatePay(int hoursWorked) {
        return super.calculatePay(hoursWorked) + bonus;
    }
}
