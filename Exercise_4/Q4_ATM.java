package Exercise_4;

import java.util.Scanner;

public class Q4_ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your account type (savings/checking): ");
        String accountType = scanner.nextLine();

        System.out.print("Enter your account balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter the amount you want to withdraw: ");
        double withdrawalAmount = scanner.nextDouble();

        if (withdrawalAmount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            if (accountType.equals("savings")) {
                if (balance - withdrawalAmount < 100) {
                    System.out.println("Minimum balance required.");
                } else {
                    double newBalance = balance - withdrawalAmount;
                    System.out.println("Your new balance is: " + newBalance);
                }
            } else if (accountType.equals("checking")) {
                if (balance - withdrawalAmount < 50) {
                    System.out.println("Low balance warning.");
                } else {
                    double newBalance = balance - withdrawalAmount;
                    System.out.println("Your new balance is: " + newBalance);
                }
            } else {
                System.out.println("Invalid account type.");
            }
        }

        scanner.close();
    }
}