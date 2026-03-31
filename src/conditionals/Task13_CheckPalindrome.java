package conditionals;

import java.util.Scanner;

public class Task13_CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter N:");
        int num = sc.nextInt();
        if(num == Check(num)){
            System.out.println(num + " - this number is Palindrome");
        }else{
            System.out.println(num + " - this number isn't Palindrome");
        }

    }
    public static int Check(int num){
        int reversed = 0;
        while (num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
