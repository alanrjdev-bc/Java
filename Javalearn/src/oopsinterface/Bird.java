package oopsinterface;

public class Bird  implements Animal,Flyable{

	public void sound() {
		System.out.println(" peacock Sound");
	}
	public void fly() {
		System.out.println("can fly");
	}
	
	public static void main(String[] args) {
		Bird b1=new Bird();
		b1.fly();
		

	}

}
