package numbers;

import java.util.Scanner;

public class Task18_DigitSum {
    public static void main(String[] args) {
        System.out.print("Please enter number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        int sum = 0;
        for(int i =0; i<=n; i++){
            result = n %10;
            sum += result;
            n = n/10;
        }
        System.out.println(sum);
    }
}
