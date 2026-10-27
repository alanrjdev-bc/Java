package oopsinhertance;

public class Car extends Vehicle{
	String tyers;
	String type;
	
	public void start() {
		System.out.println("Car start");
	}
	public Car(String name, double price, String model,String tyers,String type) {
		super(name,price,model);
		this.tyers=tyers;
		this.type=type;
	}

	public static void main(String[] args) {
		
	}

}
