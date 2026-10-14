package oopspractice;

public class Product {

	String name;
	double price;
	int quantity;

	public Product(String name, double price, int quantitiy) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}

	public void category() {
		System.out.println("Elctronic iteam");
	}

	public void category1() {
		System.out.println("Furniture");
	}

	public void print() {
		System.out.println("Product name : " + name);
		System.out.println("product price : " + price);
		System.out.println("product quantity : " + quantity);
	}

	public void display(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}
	public Product() {
		
	}
	public static void main(String[] args) {
		
	}

}
