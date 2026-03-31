package loops;

public class Task07_Pyramid {
    public static void main(String[] args) {
        int a = 14; // piramidanın hündürlüyü

        for (int i = 1; i <= a; i++) {
            // boşluqlar
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }

            // ulduzlar
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // hər sətrin sonunda növbəti sətrə keç
        }
    }
}
