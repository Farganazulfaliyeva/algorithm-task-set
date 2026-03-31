package loops;

import java.util.Scanner;

public class Task11_ArmstrongNumbersInRange {
    public static void main(String[] args) {
        System.out.print("Please enter number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (Count(num) == num ){
            System.out.println(Count(num) + " - Armstrong!");
        }
        else{
            System.out.println("Not Armstrong!");
        }

    }

    public static int Count(int num){
        int original = num;
        int result = 0;

        while (num > 0) {
            int digit = num % 10;        // son rəqəm
            result += digit * digit * digit; // kub əlavə et
            num /= 10;                    // növbəti rəqəmə keç
        }

        return result;
    }

}
