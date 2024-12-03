package Exercise;

import java.util.Scanner;

public class Day3_Q4_area_circle {

	public static void main(String[] args) {
		// WAP to print area of circle (A=pi*r^2 where pi=3.141)?
		
		
		 // Declare constant value of pi
        final double PI = 3.141;

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area of the circle
        double area = PI * radius * radius;

        // Display the area of the circle
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        // Close the scanner object
        scanner.close();

	}

}
