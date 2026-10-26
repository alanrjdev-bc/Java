package oopspolymorphisum;

public class Methodoverrloading {
	
	public void add(int a ,int b) {
		System.out.println(a+b);
	
	}
	public void add(int a ,int b,int c) {
		System.out.println(a+b+c);
	
	}
	public static void main(String[] args) {
		Methodoverrloading obj1=new Methodoverrloading();
		obj1.add(1,2);
		obj1.add(1, 3, 2);
	}

	
}
