package method;

public class Members {
	static String name="Alan";
	static int a = 1001;
	static int age;
	static {
		System.out.println("Hello");
		age=20;
		
	}
	static {
		System.out.println("Alan");
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(age);
		add(5);

	}
	public static void  add(int a) {
		System.out.println(a);
		System.out.println(Members.a);
		
		
	}
	
 
}
