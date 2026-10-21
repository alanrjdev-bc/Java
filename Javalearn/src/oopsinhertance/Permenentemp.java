package oopsinhertance;

public class Permenentemp extends Employe {
	String Companyname;

	public Permenentemp(String name, int id, double salary,String Companyname) {
      super(name,id,salary);
      this.Companyname=Companyname;
	}

	public static void main(String[] args) {
		Permenentemp obj2=new Permenentemp("Arjun",102002,34500.34,"Quest");
		obj2.print();
		System.out.println(obj2.Companyname);
		 
		Permenentemp E2=new Temporary("Noah",202006,78234.5,"Indigo","noah@gmail.com",123456);
		Temporary P2=(Temporary) E2;
		System.out.println(P2.emailid);
		System.out.println(P2.phoneno);
		

	}

}
