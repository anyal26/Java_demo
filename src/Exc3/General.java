package Exc3;

public class General {
    public static void main(String[] args) {
        Manager manager = new Manager("Anna",100, 500);

        int hoursWorked = 200;
        System.out.println(manager.name + "'s salary is $"
                +manager.calculatePay(hoursWorked));
    }
}
