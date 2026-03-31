package loops;

import java.util.Scanner;

public class Task06_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number:");

        int number = scanner.nextInt();
        int factorial = 1;

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers!");
            return;
        }

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial: " + factorial);
    }
}
