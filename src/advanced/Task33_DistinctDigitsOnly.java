package advanced;

import java.util.Scanner;

public class Task33_DistinctDigitsOnly {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number: ");
        long number = scanner.nextLong();

        boolean result = hasDistinctDigits(number);

        // Şərtə görə mesaj
        if (result) {
            System.out.println("All digits are distinct. "+number);
        } else {
            System.out.println("There are repeated digits. "+number);
        }
    }

    public static boolean hasDistinctDigits(long n) {
        n = Math.abs(n); // Mənfi ədədlər üçün müsbətə çevir

        boolean[] seen = new boolean[10]; // 0-9 rəqəmləri üçün yaddaş

        while (n > 0) {
            int digit = (int) (n % 10); // son rəqəmi götür

            if (seen[digit]) {
                // Əgər rəqəm artıq görünmüşdürsə → təkrar tapıldı
                return false;
            }

            seen[digit] = true; // Əks halda rəqəmi işarələ
            n /= 10; // növbəti rəqəm üçün ədədin sonunu kəs
        }

        // Bütün rəqəmlər fərqli idi
        return true;
    }
}
