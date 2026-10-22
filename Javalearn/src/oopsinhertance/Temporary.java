package oopsinhertance;

public class Temporary extends Dailywages{
	int phoneno;
	
	public Temporary(String name, int id, double salary,String Companyname,String emailid,int phoneno) {
		super( name,  id,  salary, Companyname,emailid);
		this.phoneno=phoneno;
		
	}

	public static void main(String[] args) {
	Temporary obj4=new Temporary("Irfan",202004,23400.4,"Tata","irfan@gmail.com",234567892);
	obj4.print();
	System.out.println(obj4.Companyname);
	System.out.println(obj4.emailid);
	System.out.println(obj4.phoneno);
	}

}
