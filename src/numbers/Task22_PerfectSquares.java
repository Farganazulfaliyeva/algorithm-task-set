package numbers;

import java.util.Scanner;

public class Task22_PerfectSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = scanner.nextInt();

        if (CheckSquare(n)) {
            System.out.println("Perfect Square number: " + n);
        } else {
            System.out.println("Not Perfect: " + n);
        }
    }

    public static boolean CheckSquare(int n) {
        if (n < 1) return false;

        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                return true;
            }
        }

        return false;
    }
}
