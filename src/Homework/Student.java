package Homework;

import java.util.Scanner;
public class Student {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите количество студентов: ");
            int numberOfStudents = scanner.nextInt();

            int totalScore = 0;
            int studentCount = 0;

            while (studentCount < numberOfStudents) {
                System.out.print("Введите оценку для студента " + (studentCount + 1) + ": ");
                int grade = scanner.nextInt();
                if (grade < 1 || grade > 100)
                totalScore += grade;
                studentCount++;
            }
            if (studentCount > 0) {
                double averageScore = (double) totalScore / studentCount;
                System.out.println("Средний балл группы из " + studentCount + " студентов: " + averageScore);
            } else
            scanner.close();
        }
    }

