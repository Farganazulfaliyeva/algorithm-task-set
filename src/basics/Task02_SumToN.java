package basics;

import java.util.Scanner;

public class Task02_SumToN {
    public static void main(String[] args) {
        System.out.println("Enter number please:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number<=0){
            System.out.println("Please enter a positive number!");
            return;
        }
        int sum = (number * (number + 1)) / 2;

        System.out.println("Sum:" + sum);
    }
}
