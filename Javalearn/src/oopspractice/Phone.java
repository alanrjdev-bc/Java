package oopspractice;

public class Phone extends Electronicsone {
	public Phone(String name, double price, int quantity, String color) {
		super(name, price, quantity, color);
	}
	@Override
	public void use() {
		System.out.println("for scroll");
	}


}
