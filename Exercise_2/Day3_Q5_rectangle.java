package Exercise;

import java.util.Scanner;

public class Day3_Q5_rectangle {

	public static void main(String[] args) {
		// WAP to print area of a rectangle (A=width*height)?
		
		// Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
		
			
        // Prompt the user to enter the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Prompt the user to enter the height of the rectangle
        System.out.print("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();

        // Calculate the area of the rectangle
        double area = width * height;

        // Display the area of the rectangle
        System.out.println("The area of the rectangle is: " + area);

       //  Close the scanner object
        scanner.close();

	}

}


//without user input


    // Predefined values for width and height
//    double width = 5.0;  // Width of the rectangle
//    double height = 4.0; // Height of the rectangle
//
//    // Calculate the area of the rectangle
//    double area = width * height;
//
//    // Display the area of the rectangle
//    System.out.println("The area of the rectangle is: " + area);
    
    
