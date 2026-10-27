package oopsabstraction;

public class Cat extends Animal {
	String color;

	public void sound() {
		System.out.println("Meow");
	}

	public Cat(double speed, String color) {
		super(speed);
		this.color = color;
	}

}
