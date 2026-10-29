package oopsinterface;

public class Employe implements Payable {
	int salary;
	int increment;

	@Override
	public void pay() {
		System.out.println("salary is " + ( salary+increment));
	}

	public Employe(int salary, int increment) {
		super();
		this.salary = salary;
		this.increment = increment;
	}

}
