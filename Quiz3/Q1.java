package Quiz3;

public class Q1 {
	
	
		// Print a Triangle
    public static void main(String[] args) {
    int rows = 9;                           // Number of rows in the pyramid

    for (int i = 1; i <= rows; i++) {
        // Print spaces
        for (int j = rows; j > i; j--) {
            System.out.print(" ");
        }
        // Print stars
        for (int k = 1; k <= i; k++) {
            System.out.print("* ");
        }
        System.out.println();                 // Move to next line
    }
}
}
