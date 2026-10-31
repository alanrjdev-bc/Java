package oopsencapsulation;

public class Employe1 {

	public static void main(String[] args) {
	   Employe obj=new Employe("Arjun",200021,23400);
	   System.out.println(obj.getname());
	   obj.setempid(20031);
	   System.out.println(obj.getempid());
	   System.out.println(obj.getsalary());
	   obj.Calculateincrement();

	}

}
