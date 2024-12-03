package Exercise_6;

// Octagon Pattern

public class p20 {
	 public static void main(String[] args) {
		// Size of the octagon
	        int n = 5; 
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || (i + j >= n / 2 && i + j < n) || (i - j <= 0 && i + j < n) || (j - i <= 0 && i + j < n)) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}
