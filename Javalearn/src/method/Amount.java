package method;

public class Amount {

	public static void main(String[] args) {
		double result=add(20000.23,12.3);
		System.out.println(result-100);
		

	}
	public static double add (double salary ,double tax) {
		double store=salary + tax;
		return store;
		
	}
}
