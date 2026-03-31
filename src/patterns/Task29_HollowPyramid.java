package patterns;

import java.util.Scanner;

public class Task29_HollowPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number of rows: ");
        int n = sc.nextInt();
        hollowPyramid(n);
    }

    public static void hollowPyramid(int n) {
        for (int i = 1; i <= n; i++) {

            // Soldakı boşluqlar
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            // Sol ulduz
            System.out.print("*");

            // Daxili boşluqlar (yalnız 2-ci sətirdən başlayır)
            if (i > 1 && i < n) {
                int innerSpaces = 2 * i - 3;
                for (int s = 1; s <= innerSpaces; s++) {
                    System.out.print(" ");
                }
                System.out.print("*"); // sağ ulduz
            }

            // Son sətir → tam ulduz olmalıdır
            if (i == n) {
                int totalStars = 2 * n - 1; // Piramidin eni
                for (int s = 2; s <= totalStars; s++) { // 1 ulduz artıq var
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}



