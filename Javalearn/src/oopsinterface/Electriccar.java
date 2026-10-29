package oopsinterface;

public class Electriccar  implements Electricvehicle {
	
	
	@Override
	public void start() {
		System.out.println("Engine on");
	}
	
	@Override
	public void stop() {
		System.out.println("Engine off");
	}
	@Override
	public void charge() {
		System.out.println("Cagrging");
	}

	public static void main(String[] args) {
		Electriccar obj1=new Electriccar();
		obj1.start();
		obj1.stop();
		obj1.charge();

	}


	
}
