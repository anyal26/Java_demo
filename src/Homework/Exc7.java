package Homework;

import java.util.Scanner;

public class Exc7 {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            {
                System.out.println("Введите целое число:");
                int a = in.nextInt();
                if (a % 2 == 0) {
                    System.out.println("Четное");
                } else {
                    System.out.println("Нечетное");
                }

            }
        }
}
