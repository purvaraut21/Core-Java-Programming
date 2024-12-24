package Quiz3;
// Wap to implement object oriented programming on a real world based senario as student information management.

import java.util.Scanner;
public class Q2 {



	// Class to represent a Student
	class Student {
	    public int id;
	    public String name;
	    public int age;
	    public String course;

	    // Constructor
	    public Student(int id, String name, int age, String course) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.course = course;
	    }

	    // Getter and Setter methods
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getCourse() {
	        return course;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public void setCourse(String course) {
	        this.course = course;
	    }

	    // Method to display student details
	    public void displayDetails() {
	        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Course: " + course);
	    }
	}

	// Main class
	public class StudentInformationManagement {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        

	        while (true) {
	            System.out.println("\n--- Student Information Management System ---");
	            System.out.println("1. Student ID");
	            System.out.println("2. Enter Name");
	            System.out.println("3. Enter Age");
	            System.out.println("4. Enter Course");
	            System.out.println("5. Exit");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter ID: ");
	                    int id = scanner.nextInt();
	                    scanner.nextLine(); //  newline
	                    System.out.print("Enter Name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter Age: ");
	                    int age = scanner.nextInt();
	                    scanner.nextLine(); //  newline
	                    System.out.print("Enter Course: ");
	                    String course = scanner.nextLine();
	            
	                    break;


	                case 2:
	                    System.out.print("Enter Student ID to Search: ");
	                    int searchId = scanner.nextInt();
	                    Student foundStudent = s.searchStudentById(searchId);
	                    if (foundStudent != null) {
	                        foundStudent.displayDetails();
	                    } else {
	                        System.out.println("Student not found!");
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter Student ID to Delete: ");
	                    int deleteId = scanner.nextInt();
	                    s.deleteStudentById(deleteId);
	                    break;

	                case 4:
	                    System.out.println("Exit system!");
	                    scanner.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice! Please try again.");
	            }
	        }
	    }
	
