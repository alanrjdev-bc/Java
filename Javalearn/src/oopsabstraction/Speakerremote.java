package oopsabstraction;

public class Speakerremote  extends Remote{
	
	public void on() {
		System.out.println("Increase the volume");
	}
	public void off() {
		System.out.println("Decrease the volume");
	}

	public Speakerremote( String name) {
		super(name);
		
	}
	
}
