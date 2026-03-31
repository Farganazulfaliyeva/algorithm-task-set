package numbers;

import java.util.Scanner;

public class Task21_StrongNumber {
    public static void main(String[] args) {
        System.out.print("Please enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == Sum(num)){
            System.out.println("Strong number: " + num);
        }else{
            System.out.println("Not Strong: " +num);
        }
    }

    public static int Sum(int num){
        int result = 0;
        while (num != 0){
            int digit  = num % 10;
            result += Factorial(digit);
           num = num/10;
        }
        return result;
    }
    public static int Factorial(int m){
        int fact = 1;
        for (int i=1; i<=m; i++){
            fact *= i;
        }
        return fact;
    }
}
