package conditionals;

import java.util.Scanner;

public class Task16_DivisibleBy3or7 {
    public static void main(String[] args) {
        System.out.println("Please enter N:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i =1; i<=n; i++){
            if (i%3==0 && i%7==0){
                System.out.println(i + " - DivisibleBy3or7");
            }
        }
    }

}
