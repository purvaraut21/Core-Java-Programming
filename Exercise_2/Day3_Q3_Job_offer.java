package Exercise;

import java.util.Scanner;

public class Day3_Q3_Job_offer {

	public static void main(String[] args) {
		// WAP that accepts the applicant's name, job title, and company name as input. Generate a formatted email message for job offer acceptance.
		
		
		  // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Get the applicant's name, job title, and company name
        System.out.println("Enter the applicant's name:");
        String applicantName = scanner.nextLine();
        
        System.out.println("Enter the job title:");
        String jobTitle = scanner.nextLine();
        
        System.out.println("Enter the company name:");
        String companyName = scanner.nextLine();
        
        // Generate the email message
        String emailMessage = generateEmailMessage(applicantName, jobTitle, companyName);
        
        // Display the formatted email message
        System.out.println("\nGenerated Job Offer Acceptance Email:");
        System.out.println(emailMessage);
        
        // Close the scanner
        scanner.close();
    }

    // Method to generate the email message
    public static String generateEmailMessage(String name, String title, String company) {
        return "Dear " + company + " Hiring Team,\n\n" +
               "I am writing to formally accept the job offer for the position of " + title + " at " + company + ". " +
               "I am excited about the opportunity to contribute to the company's success and to work with the talented team at " + company + ".\n\n" +
               "Thank you for offering me this position. I look forward to starting my role and contributing to the company's goals.\n\n" +
               "Sincerely,\n" +
               name;
    }
}
	
