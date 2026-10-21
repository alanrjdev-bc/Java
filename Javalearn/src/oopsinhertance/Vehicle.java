package oopsinhertance;

public class Vehicle {
	String name;
	double price;
	String model;
	
	
	public void print() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(model);
	}

	public Vehicle(String name, double price, String model) {
     this.name=name;
     this.price=price;
     this.model=model;
	}

	public static void main(String[] args) {

	}

}
