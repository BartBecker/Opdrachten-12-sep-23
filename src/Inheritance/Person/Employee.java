package Inheritance.Person;

public class Employee extends Person{
	
	private String jobTitle;
	
	public Employee(String firstName, String lastName, String jobTitle) {
		super(firstName, lastName);
		this.jobTitle = jobTitle;
	}
	
	public String getEmployeed() {
		return jobTitle;
	}

	@Override
	
	public String getLastName() {
		return super.getLastName() + ", " + jobTitle;
	}
	
}
