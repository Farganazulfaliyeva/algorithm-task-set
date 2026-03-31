package conditionals;

import java.util.Scanner;

public class Task15_PasswordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Password:");
        String password = scanner.nextLine();
        if (args.length == 0){
            System.out.println("Please provide the password as an argument!");
            return;
        }
        String pass = args[0];
        if(password.equals(pass)){
            System.out.println("Successfully!");
        }else{
            System.out.println("Password incorrectly!");
        }
    }
}
