package loops;

import java.util.Scanner;

public class Task12_SumEven_ProductOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        int sumEven = sumEven(n);
        long productOdd = productOdd(n);

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Product of odd numbers: " + productOdd);
    }

    // Cüt ədədlərin cəmi
    public static int sumEven(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) { // yalnız cütlər
            sum += i;
        }
        return sum;
    }

    // Tək ədədlərin hasili
    public static long productOdd(int n) {
        long product = 1;
        for (int i = 1; i <= n; i += 2) { // yalnız tək ədədlər
            product *= i;
        }
        return product;
    }
}
