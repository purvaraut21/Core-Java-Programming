package Exercise_4;

import java.util.Scanner;

public class Q9_DiscountCalculator {
	/*9. Nested If-Else for Discounts with Conditions
 	 Write a program that calculates the discount based on the membership level and the total purchase amount.

		a. If the membership level is "Gold" and the purchase amount is over $500, apply a 25% discount.
		b. If the membership level is "Silver" and the purchase amount is over $300, apply a 15% discount.
		c. If the membership level is "Bronze", apply a 5% discount regardless of the amount.
		d. If the membership level is not recognized, print "No discount available."
	 * 
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1  your membership level (Gold, Silver, Bronze): ");
        String membershipLevel = scanner.nextLine();

        System.out.print("Enter the total purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        double discount = 0;

        if (membershipLevel.equals("Gold")) {
            if (purchaseAmount > 500) {
                discount = 0.25;
            }
        } else if (membershipLevel.equals("Silver")) {
            if (purchaseAmount > 300) {
                discount = 0.15;
            }
        } else if (membershipLevel.equals("Bronze")) {
            discount = 0.05;
        } else {
            System.out.println("No discount available.");
        }

        if (discount > 0) {
            double discountAmount = purchaseAmount * discount;
            double finalAmount = purchaseAmount - discountAmount;
            System.out.printf("You get a %.0f%% discount. Your final amount is: $%.2f\n", discount * 100, finalAmount);
        }
    }

}


