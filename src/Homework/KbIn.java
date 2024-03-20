package Homework;

public class KbIn {
    public static void main(String args[])
            throws java.io.IOException {
        char symbol, end;
        int space;
        end = '.';
        space = 0;

        System.out.println("Нажмите любую кнопку. Нажмите '.' для завершения операции");
        symbol = (char) System.in.read();
        if (symbol == ' ') space += 1;
         else if (symbol == '.') {
            System.out.print("Программа завершилась " +
                    "Пробел нажимался " + space + " раз.");
        }
    }
}



