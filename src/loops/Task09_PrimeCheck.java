package loops;

import java.util.Scanner;

public class Task09_PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number:");
        int num = scanner.nextInt();
       if(CheckPrime(num)){
           System.out.println("Number is prime");
       }else {
           System.out.println("Number isn't prime");
       }


    }

    public static boolean CheckPrime(int num){
        if (num <2 ) {
            return false;
        } else{
            for (int i =2; i * i <= num; i++){
                if(num%i==0){
                   return false;
                }
            }
            return true;
        }

    }
}
