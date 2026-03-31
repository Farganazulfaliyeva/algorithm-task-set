package loops;

import java.util.Scanner;

public class Task10_PerfectNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int num = scanner.nextInt();

        int sum = perfectNumber(num);

        if (num == sum) {
            System.out.println(num + " - Perfect number");
        } else {
            System.out.println(num + " - Not perfect number");
        }
    }

    public static int perfectNumber(int num) {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
