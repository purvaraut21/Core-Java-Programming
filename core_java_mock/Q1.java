package core_java_mock;

// Q1. WAP to print a pattern using stars(*)

public class Q1 {

    // Print a Right angled Triangle and an Inverted Triangle
    public static void main(String[] args) {
        int n = 8; // Number of rows

        // Print the right-angled triangle
        for (int i = 0; i <= n; i++) { // Outer loop represents rows
            for (int j = 0; j <= i; j++) { // Inner loop represents columns
                System.out.print("* ");
            }
            System.out.println(); // Gives a new line after each row
        }

        // Print the inverted right-angled triangle
        for (int i = n - 1; i >= 0; i--) { // Outer loop represents rows
            for (int j = 0; j <= i; j++) { // Inner loop represents columns
                System.out.print("* ");
            }
            System.out.println(); // Gives a new line after each row
        }
    }
}
