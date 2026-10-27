package oopsinhertance;

public class Electronics extends Furiture{
	String model;
	
	
 public Electronics(String name,double price,int quantity,String color,String model) {
		super(name,price,quantity,color);
		this.model=model;
		
	}
}
