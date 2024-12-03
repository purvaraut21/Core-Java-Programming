//package Exercise;
//
//public class Day4_Q4_Compare {
//
//	public static void main(String[] args) {
//		// WAP to compare 2 numbers using all comparative operators and print result?
//		
//		int num1 = 2;
//		int num2 = 6;
//		
//		System.out.println("num1 == num2: " + (num1 == num2)); 
//		System.out.println("num1 != num2: " + (num1 != num2));
//		System.out.println("num1 > num2: " + (num1 > num2)); 
//		System.out.println("num1 < num2: " + (num1 < num2));
//		System.out.println("num1 >= num2: " + (num1 >= num2));
//		System.out.println("num1 <= num2: " + (num1 <= num2));
//		
//
//	}
//
//}

package Exercise;

import java.util.Scanner;

public class Day4_Q4_Compare {

	public static void main(String[] args) {
// Create a scanner object to take input from the user
Scanner scanner = new Scanner(System.in);

// User to enter two numbers
System.out.print("Enter the first number: ");
int num1 = scanner.nextInt();

System.out.print("Enter the second number: ");
int num2 = scanner.nextInt();

// Compare the numbers using different comparative operators

// Check if the numbers are equal
System.out.println("num1 == num2: " + (num1 == num2));  // Equal to

// Check if the numbers are not equal
System.out.println("num1 != num2: " + (num1 != num2));  // Not equal to

// Check if num1 is greater than num2
System.out.println("num1 > num2: " + (num1 > num2));    // Greater than

// Check if num1 is less than num2
System.out.println("num1 < num2: " + (num1 < num2));    // Less than

// Check if num1 is greater than or equal to num2
System.out.println("num1 >= num2: " + (num1 >= num2));   // Greater than or equal to

// Check if num1 is less than or equal to num2
System.out.println("num1 <= num2: " + (num1 <= num2));   // Less than or equal to

// Close the scanner object
scanner.close();
 }
}