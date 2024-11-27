package Exercise_4;

import java.util.Scanner;


public class Q10_LoanEligibilityChecker {
	/*10. Nested If-Else for Loan Eligibility
 		  Determine if a person is eligible for a loan based on their credit score and income.

		  a. If the credit score is above 700 and the income is above $50,000, print "Eligible for a loan.
          b. "If the credit score is between 600 and 700 and the income is above $30,000, print "Conditional eligibility.
		  c. "If the credit score is below 600, print "Not eligible for a loan."
	 * 
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your credit score: ");
        int creditScore = scanner.nextInt();

        System.out.print("Enter your annual income: ");
        double   income = scanner.nextDouble();

        if (creditScore > 700 && income > 50000) 
        {
            System.out.println("Eligible for a loan.");
        } else if (creditScore >= 600 && creditScore <= 700 && income > 30000) 
        {
            System.out.println("Conditional eligibility.");
        } else 
        {
            System.out.println("Not eligible for a loan.");
        }
    }
}