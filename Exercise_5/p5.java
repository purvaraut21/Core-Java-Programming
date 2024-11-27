package Exercise_5;

import java.util.Scanner;

public class p5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double balance = 1000;   // Initial balance
		int choice;
		
		
		// ATM menu using a do-while loop
		
		do {
			System.out.println("ATM Menu : ");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.println("Enter your Choice : ");
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Current Balance: $" + balance);
				break;
			
			case 2:
				System.out.println("Enter amount to deposit: ");
				double deposit = scanner.nextDouble();
				balance += deposit;   // Update balance
				System.out.println("Deposited: $" + deposit);
				break;
				
			case 3:
				System.out.println("Enter amount to withdraw: ");
				double withdraw = scanner.nextDouble();
				if (withdraw <= balance)  {
					balance -= withdraw;   // update balance
					System.out.println("Withdrawn: $" + withdraw);
				} else {
					System.out.println("Insufficient Funds.");
				}
				break;
			case 4:
				System.out.println("Thank you for using the ATM.");
				break;
			default:
				System.out.println("Invalid Choice. Try Again.");
			}
		} while (choice != 4);    // Continue until the user chooses to exit

	}

}
