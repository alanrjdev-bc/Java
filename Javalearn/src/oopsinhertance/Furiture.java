package oopsinhertance;

public class Furiture extends Product {
	String color;
	
	
	public Furiture(String name,double price,int quantity,String color) {
		super(name,price,quantity);
		this.color=color;
		
	}

}
