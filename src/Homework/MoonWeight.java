package Homework;

public class MoonWeight {
    public static void main(String[] args) {
        double my_weight = 47;
        double moon_gravity = 17;
        double earth_gravity = 100;
        double my_moon_weight;

        my_moon_weight = (moon_gravity/ earth_gravity) * my_weight ;
        System.out.println(" Мой вес на Луне равен " + my_moon_weight + " кг.");
    }
}
