package oopsinhertance;

public class Bike extends Car{
	String seatcapacity;
	public Bike(String name, double price, String model,String tyers,String type,String seatcapacity ) {
		super(name,price,model,tyers,type);
		this.seatcapacity=seatcapacity;
		
	}

	public static void main(String[] args) {
		Bike obj2=new Bike("Hero",95000,"Splendor plus","2 Tyers","Type bs6"," 2 pesron");
		obj2.print();
		System.out.println(obj2.tyers);
		System.out.println(obj2.type);
		System.out.println(obj2.seatcapacity);
		
		

	}

}
