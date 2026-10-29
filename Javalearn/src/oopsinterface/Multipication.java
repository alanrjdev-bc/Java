package oopsinterface;

public class Multipication {

	public static void main(String[] args) {
		//Using lambda expression.....
		Function mul = (m, d) -> {System.out.println(m * d);};
		mul.Calculateof(6, 7);
		Function div = (e, f) -> {System.out.println(e / f);};
		div.Calculateof(12, 2);

	}

}
