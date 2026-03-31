package basics;

import java.util.Scanner;

public class Task03_BiggestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number:");
        int a = scanner.nextInt();

        System.out.println("Please enter second number:");
        int b = scanner.nextInt();

        System.out.println("Please enter third number:");
        int c = scanner.nextInt();

        int biggest = a;
        if (b > biggest) biggest = b;
        if (c > biggest) biggest = c;
        System.out.println("The biggest number: " + biggest);
    }
}
