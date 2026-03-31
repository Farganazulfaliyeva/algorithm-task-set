package conditionals;

import java.util.Scanner;

public class Task14_CompareSumAndProduct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter N:");
        int num = sc.nextInt();

        System.out.println(Sum(num));
        System.out.println(Product(num));

        if (Product(num) >= Sum(num)) {
            System.out.println(num + " - Product is greater");
        } else {
            System.out.println(num + " - Sum is greater");
        }
    }

    public static int Sum(int num) {
        int n = 0;
        for (int i = 1; i <= num; i++) {
            n += i;
        }
        return n;
    }

    public static long Product(int num) {
        long m = 1;
        for (int i = 1; i <= num; i++) {
            m *= i;
        }
        return m;
    }
}
