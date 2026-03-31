package numbers;

import java.util.Scanner;

public class Task23_ContainsZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = scanner.nextInt();
        System.out.println(checkZero(num));
    }
    public static boolean checkZero(int n) {
        if (n == 0) return true; // xüsusi hal

        while (n > 0) {
            int digit = n % 10;  // son rəqəm
            if (digit == 0) {
                return true;
            }
            n = n / 10; // son rəqəmi at
        }
        return false;
    }

}
