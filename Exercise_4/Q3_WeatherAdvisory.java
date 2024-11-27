package Exercise_4;

import java.util.Scanner;


public class Q3_WeatherAdvisory {
	/* 3. Switch Case for Weather Advisory
 		  Create a program that provides weather advisories based on the weather condition.
	      Use a switch statement to provide advisories for:
		  1: "Sunny - Stay hydrated."
          2: "Rainy - Carry an umbrella."
          3: "Snowy - Wear warm clothes."
          4: "Windy - Secure loose items."
		If the number is not between 1 and 4, print "Invalid weather condition."
	 * 
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the weather condition code (1-4): ");
        int weatherCode = scanner.nextInt();

        switch (weatherCode) {
            case 1:
                System.out.println("Sunny - Stay hydrated.");
                break;
            case 2:
                System.out.println("Rainy - Carry an umbrella.");
                break;
            case 3:
                System.out.println("Snowy - Wear warm clothes.");
                break;
            case 4:
                System.out.println("Windy - Secure loose items.");
                break;
            default:
                System.out.println("Invalid weather condition.");
        }

        scanner.close();
    }
}

	
