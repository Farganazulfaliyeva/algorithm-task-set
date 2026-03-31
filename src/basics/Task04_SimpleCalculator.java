package basics;

import java.util.Scanner;

public class Task04_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number:");
        double a = scanner.nextDouble();

        System.out.println("Please enter second number:");
        double b = scanner.nextDouble();

        System.out.println("Please enter operation (+, -, *, /):");
        char op = scanner.next().charAt(0);

        double result;

        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            if (b == 0) {
                System.out.println("Error: Division by zero is not allowed!");
                return;
            }
            result = a / b;
        } else {
            System.out.println("Invalid operator!");
            return;
        }

        System.out.println("Result: " + result);
    }
}
