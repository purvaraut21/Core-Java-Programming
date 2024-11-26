package Exercise;

public class Day4_Q2_positive_negative {

	public static void main(String[] args) {
		//  Implement a program that checks if a number is positive, negative, or zero using relational operators.
		
		// Declare a number
		int number = 0;
		
		// Check using relational/ternary operator and print the result
		String result = (number > 0) ? "The number is Positive.":
						(number < 0) ? "The number is Negative.":
						"The number is Zero.";
		
		// Print the result
		System.out.println("result:" +result);
		
	}

}


// with user input

//package Exercise;
//
//import java.util.Scanner;
//
//public class Day4_Q2_positive_negative {
//	public static void main(String[] args) {
//		// Create a scanner object to take input from the user
//        Scanner scanner = new Scanner(System.in);
//
//        // Ask the user to enter a number
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//
//        // Check using ternary operator and print the result
//        String result = (number > 0) ? "The number is positive." : 
//                        (number < 0) ? "The number is negative." : 
//                        "The number is zero.";
//
//        // Print the result
//        System.out.println(result);
//
//        // Close the scanner object
//        scanner.close();
//    }
//}
