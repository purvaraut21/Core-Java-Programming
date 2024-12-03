package Exercise_6;

public class Snippet {
	        int n = 5; // Number of rows
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                // Create a zigzag pattern by printing stars in alternate columns
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
}

