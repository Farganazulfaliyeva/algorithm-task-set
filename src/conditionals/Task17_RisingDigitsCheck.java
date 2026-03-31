package conditionals;

import java.util.Scanner;

public class Task17_RisingDigitsCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir ədəd daxil edin: ");
        int number = scanner.nextInt();

        if (isRisingDigits(number)) {
            System.out.println(number + " rəqəmləri artan sıradadır.");
        } else {
            System.out.println(number + " rəqəmləri artan sırada deyil.");
        }
    }

    public static boolean isRisingDigits(int number) {
        int previousDigit = 10; // 0-9 rəqəmləri üçün başlanğıcdan böyük bir dəyər
        while (number > 0) {
            int currentDigit = number % 10; // sondakı rəqəmi alırıq
            if (currentDigit >= previousDigit) {
                return false; // artan sıra pozulub
            }
            previousDigit = currentDigit;
            number /= 10; // sondakı rəqəmi atırıq
        }
        return true;
    }
}
