package oopsinhertance;


public class Cycle extends Bike{

String moving;
	
	public Cycle(String name, double price, String model,String tyers,String type,String seatcapacity,String moving){
		super(name,price,model,tyers,type,seatcapacity);
		this.moving=moving;
	}

	public static void main(String[] args) {
	Cycle obj3=new Cycle("Hercules",12300.23,"Sports V1","2 tyres","Type 2","1","Man power");
	obj3.print();
	System.out.println(obj3.tyers);
	System.out.println(obj3.type);
	System.out.println(obj3.seatcapacity);
	System.out.println(obj3.moving);

	}
}
