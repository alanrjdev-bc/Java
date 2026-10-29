package oopsinterface;

public class Car implements Vehicle {


	@Override
	public void speed() {
		System.out.println("40km/hr");

	}

	public static void main(String[] args) {
		Vehicle obj1=new Car();
		obj1.fuleffiecency();
		obj1.speed();

	}

}
