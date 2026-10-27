package oopspractice;

public class Company {

	String name;
	String location;
	int Employes;
	int Developers;
	String emailid;
	static {
		System.out.println("  Compant_Details  ");
	}

	public void print() {
		
		System.out.println("Company Name : "+ name);
		System.out.println("Company Location : "+ location);
		System.out.println("Total No.of Employes : "+ Employes);
		System.out.println("No.of Developers : " +Developers);
		System.out.println("Company gmail : "+ emailid);

	}

	public void initalize(String name, String location, int Employes, int Developers, String emailid) {
		this.name = name;
		this.location = location;
		this.Developers = Developers;
		this.Employes = Employes;
		this.emailid = emailid;

	}

	public Company(String name, String location, int Employes, int Developers, String emailid) {
		this.name = name;
		this.location = location;
		this(Employes, Developers, emailid);

	}

	public Company(int Employes, int Developers, String emailid) {

		this.Developers = Developers;
		this.Employes = Employes;
		this.emailid = emailid;
	}

	public Company(String name, String location, String emailid) {
		this.name = name;
		this.location = location;
		this.emailid = emailid;

	}

	public Company(String name, int Employes, int Developers) {
		this.name = name;
		this.Developers = Developers;
		this.Employes = Employes;
	}

	public Company(String name) {
		this.name = name;

	}

	public Company(int Employe) {
		this.Employes = Employes;
	}

	public Company() {

	}

}
