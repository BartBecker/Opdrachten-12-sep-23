package Inheritance.Employee;

public class HRManager extends Employee {
	
	public HRManager(int salary) {
		super(salary);
	}
	
	public void work() {
		System.out.println("HR'ing people!");
	}
	
	public void addEmployee() {
		 System.out.println("Adding new employee");
	}

}
