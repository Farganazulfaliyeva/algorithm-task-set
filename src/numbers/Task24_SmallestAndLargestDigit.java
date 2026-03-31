package numbers;

import java.util.Scanner;

public class Task24_SmallestAndLargestDigit {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = scanner.nextInt();
        FIndMaxMin(n);

    }
    public static void FIndMaxMin(int num){
        int smallest =9;
        int biggest =0;
        while(num >0){
            int digit = num %10;
            if (digit<smallest){
                smallest = digit;
            }
            if (digit > biggest){
                biggest = digit;
            }
            num /= 10;
        }
        System.out.println("Smallest digit = " + smallest);
        System.out.println("Biggest digit = " + biggest);
    }
}
