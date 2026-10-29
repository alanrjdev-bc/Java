package oopsinterface;

public class Employee extends Employedetails implements Technopark, Company1 {
	double Yearofexperience;
	int increment;

	public Employee(String name, int id, double salary, int providentfund, double Yearofexperience, int increment) {
		super(name, id, salary, providentfund);
		this.Yearofexperience = Yearofexperience;
		this.increment = increment;
	}

	@Override
	public void enterytime() {
		System.out.println("Entry time : "+"Morning 9:00am");

	}

	@Override
	public void jobrole() {
		System.out.println("Job Role :  "+"Software developer");

	}

	@Override
	public void salary() {
		System.out.println("Actualsalary : "+ salary);

	}

	@Override
	public void Calculateincrement() {
		System.out.println("Actualsalary plus increment :  " + (salary + increment));

	}

	public void Calculatepf() {

		System.out.println("PF Deduction : " + ((salary + increment) - providentfund));

	}

	@Override
	public void exittime() {
		System.out.println("Exit time : "+ "Evening 7:30pm");

	}

	public static void main(String[] args) {
		Employee obj = new Employee("Arjun", 2002, 23400.4, 2300, 2, 4500);
		obj.enterytime();
		obj.jobrole();
		obj.salary();
		obj.Calculateincrement();
		obj.Calculatepf();
		obj.exittime();
	}

}
