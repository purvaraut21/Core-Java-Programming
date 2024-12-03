package Exercise_6;

// Zigzag Pattern

public class p26 {
	public static void main(String[] args) {
	// Number of rows
		
      int n = 5; 

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
