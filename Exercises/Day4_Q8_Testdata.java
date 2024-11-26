package Exercise;

import java.util.Scanner;

public class Day4_Q8_Testdata {

	public static void main(String[] args) {
//		// Write a Java program that reads a number in inches and converts it to meters. Note: One inch is 0.0254 meter.
//		Test Data
//		Input a value for inch: 1000
		
        
        Scanner scanner = new Scanner(System.in);

        // User to enter a value for inches
        System.out.print("Input a value for inch: ");
        double inches = scanner.nextDouble();

        // Conversion factor: 1 inch = 0.0254 meter
        double meters = inches * 0.0254;

        // Display the result
        System.out.println(inches + " inches is equal to " + meters + " meters.");

        
        scanner.close();

	}

}
