package method;

public class Acess {
	
	
       
	public static void main(String[] args) {
		System.out.println(Staticvariable.Address);
		Staticvariable obj1=new Staticvariable();
		obj1.name="Arjun";
		obj1.Age=26;
		obj1.course="Data Analyst";
		System.out.println(" Name : "+ obj1.name);
		System.out.println(" Age  : " + obj1.Age);
		System.out.println(" Course : "+ obj1.course);
		//
		obj1.name="Rahul";
		obj1.Age=32;
		obj1.course="AI & ML";
		System.out.println(" Name : "+ obj1.name);
		System.out.println(" Age  : " + obj1.Age);
		System.out.println(" Course : "+ obj1.course);
		
		
	}

}
