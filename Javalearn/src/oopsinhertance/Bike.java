package oopsinhertance;

public class Bike  extends Vehicle {
	String speed;
	
	public Bike(String name, double price, String model,String speed) {
		super(name,price,model);
		this.speed=speed;
	}


}
