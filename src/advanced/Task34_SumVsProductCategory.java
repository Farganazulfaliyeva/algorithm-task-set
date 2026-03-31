package advanced;

import java.util.Scanner;

public class Task34_SumVsProductCategory {

    public static void main(String[] args) {

        System.out.print("Please enter the number: ");
        int number = new Scanner(System.in).nextInt();

        //Validation: ən azı 2 rəqəmli və müsbət olmalıdır
        if (number < 10) {
            System.out.println("Please enter a number with 2 or more digits!");
            return;
        }

        int sum = SumNumber(number);
        int product = ProductNumber(number);

        if (product > sum) {
            System.out.println("Product category: " + number);
        } else if (product < sum) {
            System.out.println("Sum category: " + number);
        } else {
            System.out.println("Equal category: " + number);
        }
    }

    public static int SumNumber(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static int ProductNumber(int n) {
        int product = 1;
        while (n > 0) {
            product *= n % 10;
            n = n / 10;
        }
        return product;
    }
}
