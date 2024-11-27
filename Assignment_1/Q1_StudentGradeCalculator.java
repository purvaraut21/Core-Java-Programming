package Assignment_1;

import java.util.Scanner;

public class Q1_StudentGradeCalculator {
	/*1. Student Grade Calculator

		 Problem Statement: 
			Write a program that accepts the names and scores of three subjects (Math, Science, and English) for a student. Calculate the average score and determine the grade based on the following criteria:
			Average >= 90: Grade A 
			Average >= 75: Grade B
			Average >= 60: Grade C
			Average < 60: Grade D
			
			Requirements:
			Use appropriate data types for scores and average.
			Use escape sequences to format the output neatly.
	 * 
	 */
	

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter student's name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter Math score: ");
	        double mathScore = scanner.nextDouble();

	        System.out.print("Enter Science score: ");
	        double scienceScore = scanner.nextDouble();

	        System.out.print("Enter English score: ");
	        double englishScore = scanner.nextDouble();

	        double averageScore = (mathScore + scienceScore + englishScore) / 3;

	        char grade;

	        switch ((int) averageScore / 10) {
	            case 10:
	            case 9:
	                grade = 'A';
	                break;
	            case 8:
	            case 7:
	                grade = 'B';
	                break;
	            case 6:
	                grade = 'C';
	                break;
	            default:
	                grade = 'D';
	        }

	        System.out.println("\nStudent Name: " + name);
	        System.out.printf("Average Score: %.2f\n", averageScore);  // format string
	        System.out.println("Grade: " + grade);
	   }
	

}


