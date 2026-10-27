package oopsabstraction;

public abstract class Animal {
	double speed;

	public Animal(double speed) {
		this.speed = speed;

	}

	public abstract void sound();

	public static void main(String[] args) {
		Animal a1 = new Cat(10.1, "White");
		System.out.println("Speed : " + a1.speed);
		a1.sound();

	}

}
