package oopspolymorphisum;

public class Furniture extends Product{
	String color;
	
	
	public void category() {
		System.out.println("Furniture iteam");
	}
	
	public Furniture(String name, double price, int quantity,String color) {
		super(name,price,quantity);
		this.color=color;
	}

}
