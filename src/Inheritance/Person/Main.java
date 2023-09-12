package Inheritance.Person;

public class Main {

	public static void main(String[] args) {
	
	Person person = new Person("Bart", "Becker");
	
	String firstname = person.getFirstName();
	String lastname = person.getLastName();
			
	System.out.println("Hi " + firstname + " " + lastname);
	
	Employee employee = new Employee("Bart", "Becker", "Developer");
	
	System.out.println("Hi " + employee.getFirstName()+ " " + employee.getLastName());

	}

}
