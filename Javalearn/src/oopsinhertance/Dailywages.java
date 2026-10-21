package oopsinhertance;

public class Dailywages extends Permenentemp{
	String emailid;
	
	public Dailywages(String name, int id, double salary,String Companyname,String emailid) {
		super( name,  id, salary, Companyname);
		this.emailid=emailid;
		
	}

	public static void main(String[] args) {
		Dailywages obj3=new Dailywages("Aleena",202003,45000.89,"Demo1","aleena@gmail.com");

		Permenentemp E3=new Temporary("Noah",202006,78234.5,"Indigo","noah@gmail.com",123456);
		E3.print();
		System.out.println(E3.Companyname);
		Temporary P2=(Temporary) E3;
		System.out.println(P2.emailid);
		System.out.println(P2.phoneno);

	}

}
