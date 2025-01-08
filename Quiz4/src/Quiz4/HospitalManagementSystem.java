package Quiz4;
/* Task- Hospital Management System-
 * 1-Do proper documentation
 * 2-Add conditional loops and decision making statements.
 * 3-Implement OOP's concepts {Objects,classes,methods,constructor,inheritance,polymorphism,abstractions,encapsulations}
 * 4-Implement exception handling and basics of multithreading.
 * 5-String handling and array object handling implementations.
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

// Create a Person class which have properties like (name,age)
class Person {
    protected String name;
    protected int age;

// Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

// Method to displayInfo of Person class
    public void displayInfo() {
        System.out.println("Enter your Name: " + name);
        System.out.println("Enter your Age: " + age);
    }
}

// Patient Class (Inheritance)
class Patient extends Person {
    private String patientId;
    private String appointment;

 // Constructor of Patient class
    public Patient(String name, int age, String patientId, String appointment) {
        super(name, age);
        this.patientId = patientId;
        this.appointment = appointment;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Enter a Patient ID: " + patientId);
        System.out.println("Book your appointment: " + appointment);
    }
}

// Doctor Class which is inherits by Person class,so it can inherit the Person class properties also like(name and age)
class Doctor extends Person {
    private String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }
}

// Main Class
public class HospitalManagementSystem {

    // ArrayList to store patients and doctors in list
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static ArrayList<Doctor> doctors = new ArrayList<>();
	private static String a;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Conditional Loops & Decision Making
            System.out.println("\n ******** Hospital Management System ******** ");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Display Patients");
            System.out.println("4. Display Doctors");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addPatient(scanner);
                    break;
                case 2:
                    addDoctor(scanner);
                    break;
                case 3:
                    displayPatients();
                    break;
                case 4:
                    displayDoctors();
                    break;
                case 5:
                    System.out.println("Exit.....");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Exception Handling
    private static void addPatient(Scanner scanner) {
        try {
            System.out.print("Enter Patient Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Patient Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Patient ID: ");
            String patientId = scanner.nextLine();

            System.out.print("Enter appointment: ");
            String appointment = scanner.nextLine();

          
			patients.add(new Patient(name, age, patientId, appointment));
            System.out.println("Patient added successfully!");
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
            scanner.nextLine(); 
        }
    }

    private static void addDoctor(Scanner scanner) {
        try {
            System.out.print("Enter Doctor Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Doctor Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter Specialization: ");
            String specialization = scanner.nextLine();

            doctors.add(new Doctor(name, age, specialization));
            System.out.println("Doctor added successfully!");
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
            scanner.nextLine(); 
        }
    }

    private static void displayPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
        } else {
            System.out.println("\n ***** List of Patients ***** ");
            for (Patient patient : patients) {
                patient.displayInfo();
                System.out.println("Empty");
            }
        }
    }

    private static void displayDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors found.");
        } else {
            System.out.println("\n ***** List of Doctors ***** ");
            for (Doctor doctor : doctors) {
                doctor.displayInfo();
                System.out.println("Empty");
            }
        }
    }
}
