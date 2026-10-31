package oopsencapsulation;

public class Employe {
	private String name;
	private int empid;
	private double salary;

	public Employe(String name, int empid, double salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	
	public String getname() {
		return name;
	}
	public int getempid() {
		return empid;
	}
	public void setempid(int empid) {
		this.empid=empid;
	}
	public double getsalary() {
		return salary;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}

	public void Calculateincrement(){
		System.out.println(salary=salary+(salary*10/100));
	}

	public void displayDetails() {
		System.out.println(name);
		System.out.println(empid);
		System.out.println(salary);
	}

}
