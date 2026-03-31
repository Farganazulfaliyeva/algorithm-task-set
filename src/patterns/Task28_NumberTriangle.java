package patterns;

import java.util.Scanner;

public class Task28_NumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = sc.nextInt();
//        NumberTriangl(number);
        FloydsTriangl(number);
    }
    public static void NumberTriangl(int n){
        for (int i = 1; i<=n; i++){
            for (int space=1; space<=n-i; space++){
                System.out.print(" ");
            }
            for (int digit=1; digit<=2*i-1; digit++){
                System.out.print(digit);
            }
            System.out.println();
        }
    }

    public static void FloydsTriangl(int n){
        int count = 1;
        for (int i = 1; i<=n; i++){
            for (int digit=1; digit<=i; digit++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();

        }
    }
}


