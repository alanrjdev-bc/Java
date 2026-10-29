package oopsinterface;

public class Circle implements Shape {
	int radius;
	
	public Circle(int radius) {
		this.radius=radius;
	}
	
	public void area() {
		
		double area=3.14*radius*radius;
		System.out.println("area "+area);
	}
	public void perimeter() {
		
	}

	
}
