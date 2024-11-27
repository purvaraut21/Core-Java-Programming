package Exercise_4;

import java.util.Scanner;

public class Q2_Job_Offer {
	
	/* 
		2. Nested If-Else for Job Offer Evaluation
 		Evaluate a job offer based on salary and benefits.

		a. If the salary is above $80,000 and benefits include health insurance, print "Accept the offer."
		b. If the salary is between $60,000 and $80,000, print "Consider negotiating."
		c. If the salary is below $60,000, print "Decline the offer."
	 * 
	 * 
	 */

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the offered salary: ");
	        double salary = scanner.nextDouble();

	        System.out.print("Does the offer include health insurance? (yes/no): ");
	        String healthInsurance = scanner.next();

	        if (salary > 80000) {
	            if (healthInsurance.equals("yes")) {
	                System.out.println("Accept the offer.");
	            } else {
	                System.out.println("Consider negotiating for better benefits.");
	            }
	        } else if (salary >= 60000 && salary <= 80000) {
	            System.out.println("Consider negotiating.");
	        } else {
	            System.out.println("Decline the offer.");
	        }

	        scanner.close();
	    }
	}
