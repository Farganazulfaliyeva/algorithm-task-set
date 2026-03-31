package basics;

import java.util.Scanner;

public class Task05_ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number:");
        int n = scanner.nextInt();
        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;        // sonuncu rəqəmi götür
            reverse = reverse * 10 + digit; // tərsinə əlavə et
            n = n / 10;                // son rəqəmi sil
        }

        System.out.println("Reversed number: " + reverse);
    }
}
