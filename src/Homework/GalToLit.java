package Homework;

public class GalToLit {
    public static void main(String[] args) {
        double gallons; // в этой переменной хранится значение, // выражающее объем жидкости в галлонах douЫe liters;
        double liters;  // в этой переменной хранится значение, // выражающее объем жидкости в литрах
        gallons = 20; // начальное значение соответствует 10 галлонам
        liters = gallons * 3.7854; // перевести в литры
        System.out.println(gallons + " галлонам соответствует " + liters + " литров");

    }
}
