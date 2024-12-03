package Exercise;

public class Day4_Q1_swap {

	public static void main(String[] args) {
		//  WAP to swap values of 2 numbers using third variable?
			
			// Declare two numbers
			int num1 = 10;
			int num2 = 20;
			
			
			
			// Print the original values
			System.out.println("Before Swapping:");
			System.out.println("num1:" +num1);
			System.out.println("num2:" +num2);
			
	        
	        // Swap using a third variable
	           int temp = num1;   // Store the value of num1 in temp
	           num1 = num2;       // Assign the value of num2 to num1
	           num2 = temp;       // Assign the stored value of num1 (from temp) to num2
	        
	           
	       // Print the swapped values
	           System.out.println("After Swapping:");
	           System.out.println("num1:" +num1);
	           System.out.println("num2:" +num2);
	           
	  
	}

}
