package Exercise_6;

// Hexagon Pattern

public class p16 {

	public static void main(String[] args) {
        int n = 5; 										// Size of the Hexagon
        // Upper part
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = n; j > i+1; j--) 
            {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // Middle part (maximum number of stars)
        
        for (int i = 0; i < n; i++) 
        {
            System.out.print("* ");
        }
        System.out.println();
        
        
        
        
        // Lower part
        
        for (int i = n-1; i >0; i--) 
        {
            for (int j = 0; j < n- i; j++) 
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
