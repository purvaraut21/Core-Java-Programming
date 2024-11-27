package Exercise_4;

import java.util.Scanner;

public class Q7_DaysActivities {
	
	/* 
	 * 7. Switch Case for Days and Activities
	 *  Create a program that suggests an activity based on the day of the week.
		Use a switch statement to suggest:
		1: "Go to work"
		2: "Attend a meeting"
		3: "Work from home"
		4: "Go to the gym"
		5: "Have a family dinner"
		6: "Relax and watch a movie"
		7: "Prepare for the upcoming week"
		If the number is not between 1 and 7, print "Invalid day."
	 */
	

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the day of the week (1-7): ");
	        	int day = scanner.nextInt();

	        switch (day) {
	            case 1:
	                System.out.println("Go to work");
	                break;
	            case 2:
	                System.out.println("Attend a meeting");
	                break;
	            case 3:
	                System.out.println("Work from home");
	                break;
	            case 4:
	                System.out.println("Go to the gym");
	                break;
	            case 5:
	                System.out.println("Have a family dinner");
	                break;
	            case 6:
	                System.out.println("Relax and watch a movie");
	                break;
	            case 7:
	                System.out.println("Prepare for the upcoming week");
	                break;
	                
	            default:
	                System.out.println("Invalid day.");
	        }

	        scanner.close();
	    }
	}

	

	    
	
