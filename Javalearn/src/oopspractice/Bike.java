package oopspractice;

public class Bike extends Vehicle {
	String color;
	
	
	
	public Bike(String color,String name, String type, double price) {
		super(name,type,price);
		this.color=color;

		
	}

	public static void main(String[] args) {
		Bike obj1=new Bike("Red","Tata","2 wheeler",95000);
		System.out.println(obj1.color);
		
		

	}

}
