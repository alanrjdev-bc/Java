package oopsinterface;

public class Rectangle implements Shape{
	int length;
	int breath;
	
	
	
	public Rectangle (int length,int breath) {
		this.length=length;
		this.breath=breath;
		
	}
	
	public void area() {
		System.out.println( "Area :  " + (length*breath));
	}
	public void perimeter() {
		System.out.println("Perimeter : " + (length+breath));
		
	}

	public static void main(String[] args) {
	Shape sh=new Circle(3);
		sh.area();
		Shape sh1=new Rectangle(20,30);
		sh1.area();
		sh1.perimeter();

	}

}
