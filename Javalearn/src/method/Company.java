package method;

public class Company {
	static {
		System.out.println("Demo Company");
	}
	static String text="_____Employee Details_____";
	String name;
	int age;
	int id;
	double year;
	String email;
	int salary;
	public void initalize(String n,int a,int i,double y,String e,int s) {
		name=n;
		age=a;             
		id=i;
		year=y;
		email=e;
		salary=s;
		}
	
	

	public static void main(String[] args) {
		Company obj=new Company();
		obj.name="Alan Rj";
		obj.age=23;
		obj.id=321001;
		obj.year=1.5;
		obj.email="alanrj2817@gmail.com";
		obj.salary=33500;
		System.out.println(text);
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.id);
		System.out.println(obj.year);
		System.out.println(obj.email);
		System.out.println(obj.salary);
		/////////////////////////////
		Company obj1=new Company();
		System.out.println(text);
		obj1.initalize("kiran", 22, 321002, 1, "kiran123@gmail.com", 22000);
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.id);
		System.out.println(obj1.year);
		System.out.println(obj1.email);
		System.out.println(obj1.salary);
		Company obj2=new Company();
		System.out.println(text);
		obj2.initalize("Rahul S ", 25, 321003, 2.3, "rahuldev@gmail.com", 34000);
		System.out.println(obj2.name);
		System.out.println(obj2.age);
		System.out.println(obj2.id);
		System.out.println(obj2.year);
		System.out.println(obj2.email);
		System.out.println(obj2.salary);
		
	}

}
