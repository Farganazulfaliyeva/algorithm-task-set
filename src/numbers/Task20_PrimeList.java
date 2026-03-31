package numbers;

import java.util.Scanner;

public class Task20_PrimeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Please enter last number: ");
        int last = scanner.nextInt();
        System.out.println("Prime list: ");
        primeList(first, last);
    }

    public static void primeList(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

