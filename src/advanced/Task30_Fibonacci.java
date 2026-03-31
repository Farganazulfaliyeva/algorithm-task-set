package advanced;

import java.util.Scanner;

public class Task30_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number: ");
        int num = scanner.nextInt();

        if (isFibonacci(num)) {
            System.out.println(num + " is a Fibonacci number.");
        } else {
            System.out.println(num + " is NOT a Fibonacci number.");
        }
    }

    public static boolean isFibonacci(int n) {
        if (n == 0 || n == 1) return true;

        int a = 0;
        int b = 1;

        while (b < n) {
            int next = a + b;
            a = b;
            b = next;
        }

        return b == n;
    }

    }
