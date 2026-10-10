package method;

public class Staticvariable {
	//Static
	static String Address="Panavila,Trivandrum.po";
	//Non Static variable  
	String name;
	int Age;
	String course;
	
	static {
		System.out.println("Quest Academy");
		
}
	public static void print() {
		System.out.println(" Thank you");
		
	}


	public static void main(String[] args) {
		System.out.println("Loacated: "+ Address );
		Staticvariable obj = new Staticvariable();
		obj.name = "Alan";
		obj.Age = 22;
		obj.course = "java";
		System.out.println(" Name :  " + obj.name);
		System.out.println(" Age : " + obj.Age);
		System.out.println(" Course : " + obj.course);
		//
		Staticvariable obj1 = new Staticvariable();
		obj1.name="Arjith";
        System.out.println(" Name : " + obj1.name);
        obj1.Age=23;
        System.out.println(" Age : " + obj1.Age);
        obj1.course="Python";
        System.out.println(" Course : " + obj1.course);
         print();
       
	}

}
