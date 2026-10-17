package oopspractice;

public class Vehicle {
	String name;
	String type;
	double price;

	public void print() {
		System.out.println(name);
		System.out.println(type);
		System.out.println(price);
	}

	public Vehicle(String name, String type, double price) {
		this.name = name;
		this.type = type;
		this.price = price;

	}

	public static void main(String[] args) {
		Vehicle obj1 = new Vehicle("Hero", "2 wheeler", 123000);
		obj1.print();
		Vehicle v1 = new Bike("Red", "BMW", "four wheeler", 23000);
		System.out.println(v1.name);
		System.out.println(v1.type);
		System.out.println(v1.price);
		System.out.println();

		Bike b1 = (Bike) v1;
		System.out.println(b1.color);
	}

}
