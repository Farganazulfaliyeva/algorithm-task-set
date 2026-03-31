package advanced;

import java.util.Scanner;

public class Task31_BinaryAndOctalManual {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter binary number: ");
        String binary = scanner.next();

        String octal = convertBinaryToOctal(binary);
        System.out.println("Octal value: " + octal);
    }

    public static String convertBinaryToOctal(String binary) {
        StringBuilder result = new StringBuilder();

        int i = binary.length();

        // sağdan sola 3-lük qruplar
        while (i > 0) {
            int decimalValue = 0;
            int power = 1;

            for (int j = 0; j < 3 && i > 0; j++) {
                i--;
                int bit = binary.charAt(i) - '0';
                decimalValue += bit * power;
                power *= 2;
            }

            result.append(decimalValue);
        }

        return result.reverse().toString();
    }
}
