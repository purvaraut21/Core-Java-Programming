package Exercise_6;

//Print J Pattern with * Characters

public class p4 {

	public static void main(String[] args) {
	      int rows = 7;
	        int cols = 5;

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                if (j == cols / 2 && i < rows - 1) {
	                    System.out.print("*");
	                } else if (i == rows - 1 && j < cols) {
	                    System.out.print("*");
	                } else if (i == 0 && j == cols - 1) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}
