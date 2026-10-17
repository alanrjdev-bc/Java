package oopspractice;

public class Iteam {

	String name;
	double price;
	int quantity;

	public void print() {
		System.out.println("Iteam Name : " + name);
		System.out.println("Iteam price : " + price);
		System.out.println("Iteam quantity : "+ quantity);
	}

	public void initalize(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Iteam(String name, double price, int quantity) {
		this(name,quantity);
		this.price = price;
		
	}

	public Iteam(double price, int quantity) {
		this.price = price;
		this.quantity = quantity;
	}
	public Iteam(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	public Iteam(double price,String name) {
		this.name = name;
		this.price=price;
	}
	
	
	public Iteam(String name) {
		this.name=name;
	}
	public Iteam(int quantity) {
		this.quantity=quantity;
	}
	public Iteam(double price) {
		this.price=price;
	}

	public Iteam() {

	}

}
