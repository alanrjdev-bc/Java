package method;

public class Methodoverloading {

	
	public static  void Sum(int a ,int b) {
		System.out.println(a+b);
	}
	public static void Sum(int a,int b,int c) {
		System.out.println(a+b+c);
		
	}
  
  
	public static void main(String[] args) {
		Sum(3,5,4);

	}

}
