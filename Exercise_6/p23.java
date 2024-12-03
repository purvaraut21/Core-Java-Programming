package Exercise_6;

// Star Pattern with Zigzag Lines

public class p23 {
	  public static void main(String[] args) {
		// Number of rows
	        int n = 5; 
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (i % 2 == 0) {
	                    System.out.print("* ");
	                } else {
	                    if (j == n - 1 - i) {
	                        System.out.print("* ");
	                    } else {
	                        System.out.print("  ");
	                    }
	                }
	            }
	            System.out.println();
	        }
	    }
	}
