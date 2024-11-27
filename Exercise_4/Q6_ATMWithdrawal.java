package Exercise_4;

import java.util.Scanner;

public class Q6_ATMWithdrawal {
	/*6. ATM Withdrawal with Multiple Conditions
			 Simulate a more complex ATM withdrawal process.
			
			a. If the account balance is less than the withdrawal amount, print "Insufficient funds."
			b. If the account balance is sufficient, check if the withdrawal amount is greater than $1000.
			If yes, print "A transaction fee of $10 will be applied."
			If no, print "No transaction fee."
			Deduct the amount from the balance and print the new balance.
			If the balance after withdrawal is less than $100, print "Warning: Low balance."
	 * 
	 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your account balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter the amount you want to withdraw: ");
        double withdrawalAmount = scanner.nextDouble();

        if (withdrawalAmount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            double transactionFee = 0;
            if (withdrawalAmount > 1000) {
                transactionFee = 10;
                System.out.println("A transaction fee of $10 will be applied.");
            } else {
                System.out.println("No transaction fee.");
            }

            double newBalance = balance - withdrawalAmount - transactionFee;
            System.out.println("Your new balance is: $" + newBalance);

            if (newBalance < 100) {
                System.out.println("Warning: Low balance.");
            }
        }

        scanner.close();
    }
}




