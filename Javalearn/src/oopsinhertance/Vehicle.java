package oopsinhertance;

public class Vehicle {
	String name;
	double price;
	String model;
	
	
	public void Start() {
		System.out.println("Vehicle start");
	}
	public Vehicle(String name, double price, String model) {
     this.name=name;
     this.price=price;
     this.model=model;
	}

	public static void main(String[] args) {
		Vehicle v1=new Car("Tata",3555555,"Harrier","4 tyres","Sedan");
		Car obj1 = null;
		if(v1 instanceof Car ) {
		 obj1=(Car)v1;
			}
		System.out.println(v1.name);
		System.out.println(v1.price);
		System.out.println(v1.model);
		System.out.println(obj1.tyers);
		System.out.println(obj1.type);
		v1.Start();
	
			}

}
