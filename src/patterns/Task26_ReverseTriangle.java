package patterns;

import java.util.Scanner;

public class Task26_ReverseTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = sc.nextInt();
        StarTriangl(number);
    }
    public static void StarTriangl(int n){
        for (int i = n; i>=1; i--){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
