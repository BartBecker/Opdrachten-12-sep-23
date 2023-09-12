package Inheritance.Vehicle;

public class Truck extends Vehicle{
	
	public Truck(String make, String model, int year, String fuelType, double efficiency) {
		super(make, model, year, fuelType, efficiency);
		
	}

	@Override
	
	public double calculateFuelEfficiency() {
		return getEfficiency();
	}
	
	@Override
	
	public double calculateDistanceTraveled() {
		return calculateFuelEfficiency() * getEfficiency();
	}
	
	@Override
	public double getMaxSpeed() {
		return 100.0;
	}
}
