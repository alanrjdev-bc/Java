package oopsinhertance;

public class Employe {
	String name;
	int id;
	double salary;
	static {
		System.out.println(" EMPLOYE_DETAILS ");
	}
	
	public void print() {
		System.out.println("Name : "+ name);
		System.out.println("Employe Id : "+ id);
		System.out.println("Salary : "+ salary);
	}

	public Employe(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public static void main(String[] args) {
		Employe obj1=new Employe("Alan",102001,22345.60);
		obj1.print();
		
		Employe E1=new Temporary("Luna",202005,34500,"Demo3","luna@gmail.com",23987645);
		Temporary p1=(Temporary)E1;
		System.out.println(p1.Companyname);
		System.out.println(p1.emailid);
		System.out.println(p1.phoneno);
		

	}

}
