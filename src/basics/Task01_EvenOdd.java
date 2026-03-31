package basics;

import java.util.Scanner;

public class Task01_EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter number please:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 0 ) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

    }
}
