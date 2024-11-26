package Exercise;

import java.util.Scanner;

public class Day4_Q7_computeValue {

	public static void main(String[] args) {
		// Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // User to enter an integer
        System.out.print("Enter an integer n: ");
        int n = scanner.nextInt();

        // Calculate nn, nnn, nnnn by converting n to a string and repeating it
        int nn = Integer.parseInt("" + n + n);       // nn
        int nnn = Integer.parseInt("" + n + n + n);   // nnn
        int nnnn = Integer.parseInt("" + n + n + n + n); // nnnn

        // Compute the sum n + nn + nnn + nnnn
        int result = n + nn + nnn + nnnn;

        // Print the result
        System.out.println("The result of n + nn + nnn + nnnn is: " + result);

        
        scanner.close();

	}

}
