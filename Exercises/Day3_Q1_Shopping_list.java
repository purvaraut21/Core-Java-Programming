package Exercise;

import java.util.Scanner;

public class Day3_Q1_Shopping_list {

	public static void main(String[] args) {
		//WAP that allows the user to enter the names and prices of 5 items they want to buy. 
		// The program should then calculate the total cost and display a formatted shopping list using escape sequences?

		Scanner scanner = new Scanner(System.in);
        
        // Declare variables for item names, prices, and total cost
        String item1, item2, item3, item4, item5;
        double price1, price2, price3, price4, price5;
        double totalCost;

        // Get input for item names and prices
        System.out.println("Enter the names and prices of 5 items you want to buy:");

        // Item 1
        System.out.print("Enter name of item 1: ");
        item1 = scanner.nextLine();
        System.out.print("Enter price of " + item1 + ": ");
        price1 = scanner.nextDouble();
        scanner.nextLine();  //  newline

        // Item 2
        System.out.print("Enter name of item 2: ");
        item2 = scanner.nextLine();
        System.out.print("Enter price of " + item2 + ": ");
        price2 = scanner.nextDouble();
        scanner.nextLine();  //  newline

        // Item 3
        System.out.print("Enter name of item 3: ");
        item3 = scanner.nextLine();
        System.out.print("Enter price of " + item3 + ": ");
        price3 = scanner.nextDouble();
        scanner.nextLine();  //  newline

        // Item 4
        System.out.print("Enter name of item 4: ");
        item4 = scanner.nextLine();
        System.out.print("Enter price of " + item4 + ": ");
        price4 = scanner.nextDouble();
        scanner.nextLine();  //  newline

        // Item 5
        System.out.print("Enter name of item 5: ");
        item5 = scanner.nextLine();
        System.out.print("Enter price of " + item5 + ": ");
        price5 = scanner.nextDouble();

        // Calculate total cost
        totalCost = price1 + price2 + price3 + price4 + price5;

        // Display the formatted shopping list
        System.out.println("\n----------------------------");
        System.out.println("Shopping List");
        System.out.println("----------------------------");
        System.out.printf("%-20s %-10s\n", "Item Name", "Price");
        System.out.println("----------------------------");

        // Print each item and its price
        System.out.printf("%-20s $%-9.2f\n", item1, price1);
        System.out.printf("%-20s $%-9.2f\n", item2, price2);
        System.out.printf("%-20s $%-9.2f\n", item3, price3);
        System.out.printf("%-20s $%-9.2f\n", item4, price4);
        System.out.printf("%-20s $%-9.2f\n", item5, price5);

        // Print total cost
        System.out.println("----------------------------");
        System.out.printf("%-20s $%-9.2f\n", "Total Cost", totalCost);
        System.out.println("----------------------------");

        scanner.close();
    }
}
