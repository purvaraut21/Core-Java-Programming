package Exercise_9;

  // Job Application

class JobApplication {
  String applicantName;
  String position;
  String resume;

  // Constructor
  
  public JobApplication(String applicantName, String position, String resume) {
      this.applicantName = applicantName;
      this.position = position;
      this.resume = resume;
  }

  // Method to display application details
  
  public void displayApplicationDetails() {
      System.out.println("Applicant: " + applicantName 
      		+ "\nPosition: " + position 
      		+ "\nResume: " + resume);
  }
}

 // Example usage

public class Main2 {
  public static void main(String[] args) {
      JobApplication application = new JobApplication("Purva", "Web Developer", "Resume.pdf");
      application.displayApplicationDetails();
  }
}
