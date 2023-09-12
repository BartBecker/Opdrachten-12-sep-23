package Inheritance.Vehicle;

public class Main {

	public static void main(String[] args) {
		Truck truck = new Truck("A", "B", 2020, "Diesel", 20);

		System.out.println(truck.getMaxSpeed());
	}

}
