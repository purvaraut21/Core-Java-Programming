package Exercise_4;

import java.util.Scanner;

public class Q1_Travel_budget {
	/*1. Nested If-Else for Travel Budget
  		Determine travel options based on budget and destination.

		a. If the budget is above $3000 and the destination is "Europe", print "Book a luxury package.
		b. If the budget is between $1500 and $3000 and the destination is "Asia", print "Consider a mid-range package."
		c. If the budget is below $1500, print "Look for budget-friendly options."
	 */
	

	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Budget : ");
		float Budget = scanner.nextFloat();
		
		System.out.println("Enter your Destination (Europe && Asia) : ");
		String Destination = scanner.next();
		
		if (Budget > 3000)
		{
			if (Destination.equals("Europe")) {
				System.out.println("Book a luxury package.");
			}
			else 
			{
				System.out.println("Consider a high-end package.");
			}
		}
		else if (Budget >= 1500 && Budget <= 3000)
		{
			if (Destination.equals("Asia"))
			{
				System.out.println("Consider a mid-range package.");
			} 
			else {
				System.out.println("Look for budget-friendly options.");
			}
		}

		
			scanner.close();
		
		
	 }

}
