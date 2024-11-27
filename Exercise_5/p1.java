package Exercise_5;

public class p1 {

	public static void main(String[] args) {
		int n = 10;   // Number of terms in the Fibonacci Sequence
		int a = 0, b =1;
		
		System.out.println("Fibonacci Sequence: ");
		// Generate Fibonacci Sequence using a for loop
		
		for (int i=0;i<n;i++)
		{
			System.out.println(a+ " "); // Print current term
			int next = a+b; // Calculate next term
			a = b; // Update a
			b = next; // Update b
		}

	}

}
