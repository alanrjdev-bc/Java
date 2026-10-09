package fundamentals;

public class Squarereturn {

	public static void main(String[] args) {
		int fact=squ(4,2);
		System.out.println(fact);
		

	}
	public static int squ(int a,int b) {
		int power=1;
		for(int i=1;i<=b;i++) {
			power=power*a;
		}
		return power;
		
		
	}

}
