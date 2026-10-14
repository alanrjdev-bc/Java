package method;

public class Studentdetals {
	String name;
	int Age;
	int std;

	public void display(String n, int a, int s) {
		name = n;
		Age = a;
		std = s;

	}

	public static void main(String[] args) {
		Studentdetals obj = new Studentdetals();
		obj.display("Alan", 22, 8);
		System.out.println(obj.name);
		System.out.println(obj.Age);
		System.out.println(obj.std);
		//Initialized using method

	}

}
