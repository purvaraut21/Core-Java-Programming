package Exercise_6;

//Pyramid Star Pattern with Custom Width

public class Pyramid_7 {

	public static void main(String[] args) {
		int n=5;          // Number of rows
		int width=3;      // Custom width for each star
		for (int i=1;i<=n;i++)
		{
			for (int j=i;j<n;j++)
			{
				System.out.println(" ");
			}
			for (int j=1;j<=(2*i-1);j++) 
			{
				System.out.print("*".repeat(width));
			}
			System.out.println();
		}

	}

}
