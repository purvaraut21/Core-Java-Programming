package Exercise;

public class Day2_Q3_Table {

	public static void main(String[] args) {
		// Print the Table Name,Location,Course

		// Print the table header
		System.out.println("+-----------------+-----------------+------------------------+");
        System.out.println("| Name            | Location        | Course                 |");
        System.out.println("+-----------------+-----------------+------------------------+");

        // Print the table rows
        System.out.printf("| %-15s | %-15s | %-22s |\n", "Purva Raut", "Mumbai", "Full Stack Development");
        System.out.printf("| %-15s | %-15s | %-22s |\n", "Anamika Sawant", "Thane", "Data Science");
        System.out.printf("| %-15s | %-15s | %-22s |\n", "Pratiksha Kamble", "Navi-Mumbai", "Machine Learning");
        System.out.printf("| %-15s | %-15s | %-22s |\n", "Nikita Solanki", "Nashik", "Cybersecurity");

        // Print the table footer
        System.out.println("+-----------------+-----------------+------------------------+");
    }
}
	
