package Assignment_1;

import java.util.Scanner;

public class Q2_SimpleBankingSystem {
	/* 
		2. Simple Banking System
		
		Problem Statement: 
		Create a simple banking system that allows a user to deposit and withdraw money. The program should:
		Start with an initial balance of $1000.
		Prompt the user to enter the amount to deposit or withdraw.
		Ensure that the withdrawal does not exceed the current balance.
		Display the updated balance after each transaction.
		
		Requirements:
		Use variables to store the balance and transaction amounts.
		Implement type casting if necessary (e.g., converting user input to double).
		Use escape sequences to format the output.
	 * 
	 * 
	 */
    	public static void main(String[] args) {
        double balance = 1000.0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                    System.out.println("Deposit successful. New balance: " + balance);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful. New balance: " + balance);
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting the banking system.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
