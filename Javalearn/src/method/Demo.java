package method;

public class Demo {

	int a;
	static int r = 7;

	{
		System.out.println("inside block");

	}
	{
		System.out.println("inside 2nd block");

	}

	public void print(int a) {
		System.out.println(a);

	}

	public static void main(String[] args) {

		Demo obj1 = new Demo();
		obj1.a = 4;
		obj1.r = 9;
		System.out.println(obj1.r);
		System.out.println(obj1.a);
		obj1.print(6);
		Demo obj2 = new Demo();
		obj2.a = 10;
		System.out.println(obj2.a);
		System.out.println(obj2.r);
	}
}
