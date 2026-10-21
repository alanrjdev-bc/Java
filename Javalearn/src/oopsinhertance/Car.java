package oopsinhertance;

public class Car extends Vehicle{
	String tyers;
	String type;
	public Car(String name, double price, String model,String tyers,String type) {
		super(name,price,model);
		this.tyers=tyers;
		this.type=type;
	}

	public static void main(String[] args) {
		Car obj1=new Car("Tata",3555555,"Harrier","4 tyres","Sedan");
		obj1.print();
		System.out.println(obj1.tyers);
		System.out.println(obj1.type);
	}

}
