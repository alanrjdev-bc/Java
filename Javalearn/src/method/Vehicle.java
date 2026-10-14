package method;

public class Vehicle {

	String type;
	double millage;
	String name;
	
	public void drive() {
		System.out.println("can drive");
	}
	public void out() {
		System.out.println(type);
		System.out.println(millage);
		System.out.println(name);
	}
	//Initialize the value  using method.....
	public void initalize(String t , double m , String n) {
		type=t;
		millage=m;
		name=n;
		
	}
	
	public static void main(String[] args) {
		//Initialize the value  using reference variable....
		Vehicle obj=new Vehicle();
		obj.type="Car";
		obj.millage=18.5;
		obj.name="TATA";
		System.out.println(obj.type);
		System.out.println(obj.millage);
		System.out.println(obj.name);
		obj.drive();
		Vehicle obj1=new Vehicle();
		obj1.type="Bike";
		obj1.millage=12.3;
		obj1.name="Honda";
		obj1.out();
		obj1.drive();
		Vehicle obj2=new Vehicle();
		obj2.initalize("Truck", 10.4, "Prakash");
		System.out.println(obj2.type);
		System.out.println(obj2.millage);
		System.out.println(obj2.name);
		Vehicle obj3=new Vehicle();
		obj.initalize(null, 0, null);
		
		}

}
