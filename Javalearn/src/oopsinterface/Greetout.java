package oopsinterface;

public class Greetout {

	public static void main(String[] args) {
		Greeting g1 = new Greeting() {
			@Override
			public void sayhellow() {
				System.out.println("Hello");
            }
                public void greet() {
				System.out.println("Welcome");
			}
		};
		g1.sayhellow();
		g1.greet();

	}

}
