package Inheritance.Employee;

public class Employee {
	
	private int salary;
	
	public void work() {
		System.out.println("i'm working");
	}
	
	public Employee(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}

}
