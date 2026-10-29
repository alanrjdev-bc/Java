package oopsinterface;

public class Contract implements Payable {

	int salary;

	@Override
	public void pay() {
		System.out.println("salary is " + salary);

	}

	public Contract(int salary) {
		super();
		this.salary = salary;
	}

}
