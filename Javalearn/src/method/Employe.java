package method;

public class Employe {
	String name;
	int id;
	int salary;
	static String companyname="Demo";

	public void job() {
		System.out.println("Permenennt");
	}

	public void job1() {
		System.out.println("Temporary");
	}

	public void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
	}

	public void initalize(String name, int id, int s) {
		this.name = name;
		this.id = id;
		salary = s;

	}

}
