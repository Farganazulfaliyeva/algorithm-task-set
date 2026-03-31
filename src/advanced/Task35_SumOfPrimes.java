package advanced;

import java.util.Scanner;

public class Task35_SumOfPrimes {
    public static void main(String[] args) {
        System.out.print("Please enter the number: ");
        int number = new Scanner(System.in).nextInt();

        //Validation: 2 den kicik ededler sade deyil.
        if (number<2){
            System.out.println("Please enter numbers greater than 2!");
            return;
        }
        System.out.println(SumOfPrimes(number));
    }
    public static int SumOfPrimes(int n){
        int sum =0;
        for (int i=2; i<=n; i++){
            if (IsPrime(i)){
                sum +=i;
            }
        }
        return sum;
    }
    public static boolean IsPrime(int n){
        if (n<2){
            return false;
        }
        for (int i = 2; i<=Math.sqrt(n); i++){
            if (n % i ==0){
                return false;
            }
        }
        return true;
    }
}
