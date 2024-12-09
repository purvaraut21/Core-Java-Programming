package Assignment_2;

/* ( Scientific Calculator )
 * Features:
1. Basic arithmetic operations (addition, subtraction, multiplication, division).
2. Advanced operations (square, square root, power).
3. Trigonometric functions (sine, cosine, tangent).
4. Exit option.

Implementation Steps

1. Set Up the Project: Create a new Java project and a class named ScientificCalculator.

2. Import Required Classes: Import the Scanner class for user input.

3. Define the Main Method: This will be the entry point of the program.

4. Create a Loop for User Interaction: Use a while loop to continuously prompt the user for operations until they choose to exit.

5. Display Menu Options: Show the user the available operations.

6. Get User Input: Use the Scanner to read the user's choice and the necessary numbers.

7. Perform Calculations: Use switch statements to handle different operations.

8. Display Results: Print the results of the calculations.

9. Handle Invalid Input: Use control statements to manage invalid choices.
 * 
 * 
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        int choice;

       // Start loop to continuously show the menu
        while (true) {
        	// Display the calculator menu options to the user
            System.out.println("\nScientific Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Square Root");
            System.out.println("7. Power");
            System.out.println("8. Sine");
            System.out.println("9. Cosine");
            System.out.println("10. Tangent");
            System.out.println("11. Exit");
            
            // the user to enter their choice
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            // Switch statement to handle different choices
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
                    
                 // Power
                case 7:
                    System.out.print("Enter base and exponent: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    result = Math.pow(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                    
                 // Sine
                case 8:
                    System.out.print("Enter an angle in degrees: ");
                    double angle = scanner.nextDouble();
                    result = Math.sin(Math.toRadians(angle));
                    System.out.println("Sine: " + result);
                    break;
                    
                // Cosine
                case 9:
                    System.out.print("Enter an angle in degrees: ");
                    angle = scanner.nextDouble();
                    result = Math.cos(Math.toRadians(angle));
                    System.out.println("Cosine: " + result);
                    break;
                    
                // Tangent
                case 10:
                    System.out.print("Enter an angle in degrees: ");
                    angle = scanner.nextDouble();
                    result = Math.tan(Math.toRadians(angle));
                    System.out.println("Tangent: " + result);
                    break;
                    
               
                case 11:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
