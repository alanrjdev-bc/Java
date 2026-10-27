package oopsabstraction;

public class Acremote extends Remote {

	public void on() {
		System.out.println("Increase the temperature");
	}

	public void off() {
		System.out.println("Decrease the temprature ");
	}

	public Acremote(String name) {
		super(name);

	}

}
