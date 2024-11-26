package Exercise;

public class Day4_Q9_swapwithoutthird {

	public static void main(String[] args) {
		// WAP to swap values of 2 numbers without using third variables?
		
        // Declare two numbers
        	int num1 = 10;
        	int num2 = 20;

        // Display the original values
        System.out.println("Before swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Swap using arithmetic operations
        num1 = num1 + num2;  //  num1 now holds the sum of num1 and num2
        num2 = num1 - num2;  //  num2 is assigned the value of num1
        num1 = num1 - num2;  //  num1 is assigned the value of num2

        // Display the swapped values
        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

	}

}
