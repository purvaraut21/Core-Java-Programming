package Exercise;

public class Day4_Q10_operator {

	public static void main(String[] args) {
		// WAP to calculate the value of given expression:  a*b/a-b  and  (a*b)/(a-b)?
		// (Hint : In Java Operator priority will be followed (left to right) here */% > -+ )
		
        // Assigning values to a and b
        	int a = 10;
        	int b = 5;

        // Calculate the value of the first expression: a * b / a - b
        int result1 = a * b / a - b;

        // Calculate the value of the second expression: (a * b) / (a - b)
       
        int result2 = (a * b) / (a - b);

        // Print the results of both expressions
        System.out.println("Result of a * b / a - b: " + result1);
        System.out.println("Result of (a * b) / (a - b): " + result2);

	}

} 
