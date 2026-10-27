package oopspractice;

public class Electronicsone extends Productone {
	String color;
	
	public Electronicsone(String name, double price, int quantity,String color) {
		super(name,price,quantity);
		this.color=color;
	}



	@Override
	public void use() {
		System.out.println("According to gadget");
		
	}

}
