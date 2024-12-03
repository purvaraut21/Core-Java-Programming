package Exercise_6;

// Star Pattern with Concentric Squares

public class p22 {
	 public static void main(String[] args) {
		// Size of the outer square
	        int n = 5; 
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || (i == 1 && j > 1 && j < n - 1) || (i == n - 2 && j > 1 && j < n - 1)) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}
