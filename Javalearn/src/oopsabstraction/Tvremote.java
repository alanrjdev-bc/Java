package oopsabstraction;

public class Tvremote extends Remote  {
	
	public void on() {
		System.out.println("On the tv");
	}
	public void off() {
		System.out.println("Off the tv");
	}
	
	
	public Tvremote(String name) {
		super(name);
		
	}

}
