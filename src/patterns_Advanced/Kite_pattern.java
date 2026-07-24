package patterns_Advanced;

public class Kite_pattern {

    public static void main(String[] args) {

        int n = 5;

        // Upper Part
        for (int i = 0; i < n; i++) {

            // Spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

     // Lower Part
        for (int i = 1; i < n - 1; i++) {

            // Spaces
            for (int j = i; j < n - 1; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
