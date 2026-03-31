package advanced;

import java.util.Scanner;

public class Task32_RisingDigitsOptimized {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number: ");
        long number = scanner.nextLong();

        boolean result = isRising(number);

        if (result) {
            System.out.println("Digits are in rising order. " + number);
        } else {
            System.out.println("Digits are NOT in rising order. " + number);
        }
    }

    public static boolean isRising(long n) {
        n = Math.abs(n); // mənfi ədədlər üçün

        int previousDigit = 10; // maksimum rəqəmdən böyük başlanğıc

        while (n > 0) {
            int currentDigit = (int) (n % 10);

            if (currentDigit > previousDigit) {
                return false; // azalma tapıldı
            }

            previousDigit = currentDigit;
            n /= 10;
        }

        return true;
    }
}
