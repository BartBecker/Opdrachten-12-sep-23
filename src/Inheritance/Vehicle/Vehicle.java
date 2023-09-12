package Inheritance.Vehicle;

public abstract class Vehicle {
	
	private String make;
	private String model;
	private int year;
	private String fuelType;
	private double efficiency;
	
	public Vehicle(String make, String model, int year, String fuelType, double efficiency) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.fuelType = fuelType;
		this.efficiency = efficiency;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public String getFuelType() {
		return fuelType;
	}

	public double getEfficiency() {
		return efficiency;
	}
	
	public abstract double calculateFuelEfficiency();
	
	public abstract double calculateDistanceTraveled();
	
	public abstract double getMaxSpeed();

}
