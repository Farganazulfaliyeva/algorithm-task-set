package patterns;

import java.util.Scanner;

public class Task25_StarTriangl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = sc.nextInt();
        StarTriangl(number);
    }
    public static void StarTriangl(int n){
        for (int i = 1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }

        }
    }
}
