package Application;

import java.util.List;

import Encapsulation.BankAccount;
import Encapsulation.Car;
import Encapsulation.Circle;
import Encapsulation.Employee;
import Encapsulation.Person;
import Encapsulation.Rectangle;
import Encapsulation.Student;

public class Application {

	public static void main(String[] args) {
		
		Person bart = new Person();
		
		bart.setAge(31);
		bart.setCountry("Netherlands");
		bart.setName("Bart");
		System.out.println(bart.getAge());
		bart.setAge(40);
		System.out.println(bart.getAge());
		
		// create an instance of BankAccount
		BankAccount account = new BankAccount();
		
		//Set Values using setter methods
		account.setAccountNumber(1);
		account.setBalance(100.00);
		
		// Get values using getter methods
		int accountNumber = account.getAccountNumber();
		double balance = account.getBalance();
		
		// Print the values
		System.out.println("Account nr: " + accountNumber);
		System.out.println("Balance: " + balance);
		
		Rectangle rectangle =new Rectangle();
		
	    // Set values using setter methods
	    rectangle.setLength(6.7);
	    rectangle.setWidth(12.0);

	    // Get values using getter methods
	    double length = rectangle.getLength();
	    double width = rectangle.getWidth();

	    // Print the values
	    System.out.println("Length: " + length);
	    System.out.println("Width: " + width);
	    
	    Employee employee = new Employee();
	    
	 // Set values using setter methods
	    employee.setEmployeeId(15);
	    employee.setEmployeeName("Caelius Dathan");
	    employee.setEmployeeSalary(4900.0);
	    
	    int employeeId = employee.getEmployeeId();
	    String employeeName = employee.getEmployeeName();
	    String formattedSalary = employee.getFormattedSalary();
	    double employeeSalary = employee.getEmployeeSalary();
	    
	 // Print the values
	    System.out.println("Employee Details:");
	    System.out.println("ID: " + employeeId);
	    System.out.println("Name: " + employeeName);
	    System.out.println("Salary: " + formattedSalary);
	    System.out.println("Salary: " + employeeSalary);
	    
	    Circle circle = new Circle();
	    
	    circle.setRadius(10);
	    
	    double radius = circle.getRadius();
	    double area = circle.calculateArea();
	    double perimeter = circle.calculatePerimeter();
	    
	    System.out.println("Radius: " + radius);
	    System.out.println("Area: " + area);
	    System.out.println("Perimeter" + perimeter);
	    
	    Car car = new Car();
	    
	    car.setCompanyName("Citroen");
	    car.setModelName("C1");
	    car.setYear(2007);
	    
	    String carName = car.getCompanyName();
	    String modelName = car.getModelName();
	    int carYear = car.getYear();
	    double carMilage = car.getMileage();
	    
	    System.out.println("Company Name: " + carName);
	    System.out.println("Model Name: " + modelName);
	    System.out.println("Year: " + carYear);
	    System.out.println("Mileage: " + carMilage);
	    
	    // Create an instance of Student
	    Student student = new Student();

	    // Set the values using the setter methods
	    student.setStudentId(1);
	    student.setStudentName("Nadia Hyakinthos");

	    // Add grades using the addGrade() method
	    student.addGrade(92.5);
	    student.addGrade(89.0);
	    student.addGrade(90.3);

	    // Get the values using the getter methods
	    int student_id = student.getStudentId();
	    String student_name = student.getStudentName();
	    List < Double > grades = student.getGrades();

	    // Print the values
	    System.out.println("Student ID: " + student_id);
	    System.out.println("Student Name: " + student_name);
	    System.out.println("Grades: " + grades);
	    
	}

}
