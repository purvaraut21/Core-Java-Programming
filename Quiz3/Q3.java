package Quiz3;

//WAP to implement a simple calculator using conditional statements loops and oops concepts.
import java.util.Scanner;

public class Q3 {
	  public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        double num1, num2, result;
	        int choice;
	       // Start loop to show menu
	        while (true) {
	        	// Display the calculator options to the user
	            System.out.println("\nSimple Calculator");
	            System.out.println("1. Addition");
	            System.out.println("2. Subtraction");
	            System.out.println("3. Multiplication");
	            System.out.println("4. Division");
	            System.out.println("5. Square");
	            System.out.println("6. Square Root");
	            System.out.println("7. Exit");
	           
	            
	            // user to enter their choice
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            
	            // Switch statement to handling different choices
	            switch (choice) {
	            	// Addition
	                case 1:
	                    System.out.print("Enter two numbers: ");
	                    num1 = scanner.nextDouble();
	                    num2 = scanner.nextDouble();
	                    result = num1 + num2;
	                    System.out.println("Result: " + result);
	                    break;
	                 
	                 // Subtraction
	                case 2:
	                    System.out.print("Enter two numbers: ");
	                    num1 = scanner.nextDouble();
	                    num2 = scanner.nextDouble();
	                    result = num1 - num2;
	                    System.out.println("Result: " + result);
	                    break;
	                    
	                // Multiplication
	                case 3:
	                    System.out.print("Enter two numbers: ");
	                    num1 = scanner.nextDouble();
	                    num2 = scanner.nextDouble();
	                    result = num1 * num2;
	                    System.out.println("Result: " + result);
	                    break;
	                 
	                 // Division
	                case 4:
	                    System.out.print("Enter two numbers: ");
	                    num1 = scanner.nextDouble();
	                    num2 = scanner.nextDouble();
	                    if (num2 == 0) {
	                        System.out.println("Error: Division by zero");
	                    } else {
	                        result = num1 / num2;
	                        System.out.println("Result: " + result);
	                    }
	                    break;
	                    
	                 // Square
	                case 5:
	                    System.out.print("Enter a number: ");
	                    num1 = scanner.nextDouble();
	                    result = Math.pow(num1, 2);
	                    System.out.println("Result: " + result);
	                    break;
	                    
	                 // Square Root
	                case 6:
	                    System.out.print("Enter a number: ");
	                    num1 = scanner.nextDouble();
	                    result = Math.sqrt(num1);
	                    System.out.println("Result: " + result);
	                    break;
	                    
	                 // Exit
	                case 7:
	                    System.out.println("Exit");
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice");
	            }
	        }
	    }
	}
