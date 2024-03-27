package Homework;
import java.util.Scanner;
public class Exc5 {
            public static void main(String[] args) {
                double num1;
                double num2;
                double answer;
                char option;

                Scanner reader = new Scanner(System.in);
                System.out.print("Enter two numbers: ");
                num1 = reader.nextDouble();
                num2 = reader.nextDouble();

                System.out.print("\nEnter an operator (+): ");
                option = reader.next().charAt(0);
                switch(option) {
                    case '+': answer= num1 + num2;
                }
                System.out.print("\nThe result is given as follows:\n");
                System.out.printf(num1 + " " + option + " " + num2 + " = " + "answer");
            }
        }