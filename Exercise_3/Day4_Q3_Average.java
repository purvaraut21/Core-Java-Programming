package Exercise;

public class Day4_Q3_Average {

	public static void main(String[] args) {
		// WAP to find average of 10 numbers (1,2,3,4,5,6,7,8,9,10)?
		
        // Declare the numbers
        int num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5;
        int num6 = 6, num7 = 7, num8 = 8, num9 = 9, num10 = 10;

        // Calculate the sum of all numbers
        int sum = num1 + num2 + num3 + num4 + num5 + 
                  num6 + num7 + num8 + num9 + num10;

        // Calculate the average
        double average = sum / 10.0; // Use 10.0 to ensure the result is a double

        // Display the average
        System.out.println("The average of the numbers is: " + average);

	}

}
