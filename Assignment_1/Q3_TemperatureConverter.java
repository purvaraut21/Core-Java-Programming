package Assignment_1;

import java.util.Scanner;

public class Q3_TemperatureConverter {
	/*3. Temperature Converter

		Problem Statement: 
		Write a program that converts temperatures between Celsius and Fahrenheit. 
		The user should be prompted to enter a temperature and specify the conversion direction (Celsius to Fahrenheit or Fahrenheit to Celsius).
		
		Requirements:
		Use appropriate formulas for conversion:
		Celsius to Fahrenheit: ( F = C \times \frac{9}{5} + 32 )
		Fahrenheit to Celsius: ( C = (F - 32) \times \frac{5}{9} )
		Use variables to store the input temperature and the converted temperature.
		Format the output using escape sequences.
	 * 
	 * 
	 */

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the temperature: ");
	        double temperature = scanner.nextDouble();

	        System.out.print("Enter the conversion direction (C to F or F to C): ");
	        String direction = scanner.next().toUpperCase();

	        double convertedTemperature;

	        if (direction.equals("C TO F")) {
	            convertedTemperature = (temperature * 9 / 5) + 32;
	            System.out.printf("Celsius is %.2f Fahrenheit.\n", temperature, convertedTemperature);
	        } else if (direction.equals("F TO C")) {
	            convertedTemperature = (temperature - 32) * 5 / 9;
	            System.out.printf("Fahrenheit is %.2f Celsius.\n", temperature, convertedTemperature);
	        } else {
	            System.out.println("Invalid conversion direction. Please try again.");
	        }
	    }
	}
