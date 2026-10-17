package oopspractice;

public class Meal {
	String rice;
	int quantity;
	double price;
	
	public void print() {
		System.out.println(rice);
		System.out.println(quantity);
		System.out.println(price);
	}

	public Meal(String rice, int quantity, double price) {
		this.rice=rice;
		this.quantity=quantity;
		this.price=price;
		

	}

	public static void main(String[] args) {
		

	}

}
