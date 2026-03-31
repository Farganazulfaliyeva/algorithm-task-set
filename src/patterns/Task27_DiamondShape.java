package patterns;

import java.util.Scanner;

public class Task27_DiamondShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = sc.nextInt();
        diamond(n);
    }

    public static void diamond(int n) {

        // ÜST HİSSƏ (1 → n)
        for (int i = 1; i <= n; i++) {

            // boşluqlar (rombu ortalamaq üçün)
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // ulduzlar (1,3,5,7... → 2*i-1)
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // ALT HİSSƏ (n-1 → 1)
        for (int i = n - 1; i >= 1; i--) {

            // boşluqlar
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // ulduzlar
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
