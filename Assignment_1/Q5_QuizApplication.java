package Assignment_1;

import java.util.Scanner;

public class Q5_QuizApplication {
	/*
		5. Basic Quiz Application
		
		Problem Statement: 
		Develop a simple quiz application that asks the user three multiple-choice questions. 
		For each question, the user should input their answer, and the program should keep track of the score. 
		At the end of the quiz, display the total score and percentage.
		
		Requirements:
		Use variables to store questions, options, user answers, and scores.
		Implement type casting if necessary (e.g., converting user input to an integer for score calculation).
		Use escape sequences to format the questions and options clearly.
		Calculate the percentage based on the total score.

	 */

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int score = 0;

	        // Question 1
	        System.out.println("Question 1: What is the capital of France?");
	        System.out.println("a) London");
	        System.out.println("b) Paris");
	        System.out.println("c) Berlin");
	        System.out.print("Enter your answer (a, b, or c): ");
	        char answer1 = scanner.next().charAt(0);
	        if (answer1 == 'b') {
	            score++;
	        }

	        // Question 2
	        System.out.println("\nQuestion 2: What is the largest country in the world by land area?");
	        System.out.println("a) Russia");
	        System.out.println("b) Canada");
	        System.out.println("c) China");
	        System.out.print("Enter your answer (a, b, or c): ");
	        char answer2 = scanner.next().charAt(0);
	        if (answer2 == 'a') {
	            score++;
	        }

	        // Question 3
	        System.out.println("\nQuestion 3: Which planet is known as the Red Planet?");
	        System.out.println("a) Mars");
	        System.out.println("b) Venus");
	        System.out.println("c) Jupiter");
	        System.out.print("Enter your answer (a, b, or c): ");
	        char answer3 = scanner.next().charAt(0);
	        if (answer3 == 'a') {
	            score++;
	        }

	        // Calculate percentage
	        double percentage = (double) score / 3 * 100;

	        System.out.println("\nYour Score: " + score + "/3");
	        System.out.printf("Percentage: %.2f%%\n", percentage);
	    }
	}
