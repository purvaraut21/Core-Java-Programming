package Exercise_6;

// CheckerBoard Pattern

public class p27 {
	 public static void main(String[] args) {
		 	// Size of the checkerboard
		 
	        int n = 8; 

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if ((i + j) % 2 == 0) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}
