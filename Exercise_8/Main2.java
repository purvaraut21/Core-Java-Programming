package Exercise_8;

/* 2. Vehicle Rental System:Design a Vehicle class with attributes 
 * for make, model, and rental price. Create subclasses Car and Bike 
 * that add specific attributes (e.g., number of doors for cars). 
 * Implement methods to calculate rental cost based on the number of days rented.
 */

class Vehicle {
	public String make;
	public String model;
	public double rentalPricePerDay;

    public Vehicle(String make, String model, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
    }
    public double calculateRentalCost(int numDays) {
        return rentalPricePerDay * numDays;
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, double rentalPricePerDay, int numDoors) {
        super(make, model, rentalPricePerDay);
        this.numDoors = numDoors;
    }
}
	
class Bike extends Vehicle {
    private String engineType;

    public Bike(String make, String model, double rentalPricePerDay, String engineType) {
        super(make, model, rentalPricePerDay);
        this.engineType = engineType;
    }
}


public class Main2 {

	public static void main(String[] args) {
        Car car = new Car("Defender", "Camry", 50.0, 4);
        Bike bike = new Bike("Audi", "CBR650R", 30.0, "Petrol");

        int numDays = 5;

        double carRentalCost = car.calculateRentalCost(numDays);
        double bikeRentalCost = bike.calculateRentalCost(numDays);

        System.out.println("Car Rental Cost: $" + carRentalCost);
        System.out.println("Bike Rental Cost: $" + bikeRentalCost);
    }
}
