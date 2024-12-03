package Exercise;

import java.util.Scanner;

//MultiOperatorCalculator

public class Day3_Q2_Simple_calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input two numbers
		System.out.println("Enter First Number:");
		int a = scanner.nextInt();
		System.out.println("Enter Second Number:");
		int b = scanner.nextInt();
		

		
		// Addition of 2 numbers
		int sum = a + b;
		
		// subtraction of 2 numbers
		int sub = a - b;
		
		// multiplication of 2 numbers
		int mul = a * b;
		
		// division of 2 numbers
		int div = a / b;
		
		 	System.out.println("Addition: " + a + " + " + b + " = " + sum);
	        System.out.println("Subtraction: " + a + " - " + b + " = " + sub);
	        System.out.println("Multiplication: " + a + " * " + b + " = " + mul);
	        System.out.println("Division: " + a + " / " + b + " = " + div);
		
		scanner.close();
		
	}

}
