package Exc3;

public class Employee {
    protected String name;
    protected double hourPay;
    public Employee( String name, double hourPay) {
        this.name = name;
        this.hourPay = hourPay;
    }
public double calculatePay(int hoursWorked) {
        return hourPay * hoursWorked;
    }
}
