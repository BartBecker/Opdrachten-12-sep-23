package Inheritance.Shape;

public class Main {

	public static void main(String[] args) {

		Shape shape = new Shape();
		Rectangle rectangle = new Rectangle(2,3);
		
		shape.getArea();
		double area = rectangle.getArea();
		System.out.println(area);
		
		Circle circle = new Circle(10);
		System.out.println("Area: " + circle.getArea() + " Perimeter: " + circle.getPerimeter());
	}

}
