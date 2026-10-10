package method;

public class Student {
	
	static {
		System.out.println("Model School");
	}
	static String text="_____Student details_____";
	
	String name;
	int age;
	double height;
	String std;
	int grade;
	
	public void display(String n,int a,double h,String s,int g) {
		name=n;
		age=a;
		height=h;
		std=s;
		grade=g;
		
	}
	public void add() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(std);
		System.out.println(grade);
	}

	public static void main(String[] args) {
		System.out.println(text);
		Student obj=new Student();
		obj.name="Alan Rj";
		obj.std="Eight";
		obj.grade=45;
		obj.age=12;
		obj.height=4.5;
		System.out.println("Name : " + obj.name);
		System.out.println("Age : " + obj.age);
		System.out.println("Height : "+ obj.height);
		System.out.println("Standard : "+ obj.std);
		System.out.println("GRADE : "+ obj.grade);
		Student obj1=new Student();
		System.out.println(text);
		obj1.display("Arjith Sm ",13,4.4,"Ninth",55);
		System.out.println("Name : " + obj1.name);
		System.out.println("Age : " + obj1.age);
		System.out.println("Height : "+ obj1.height);
		System.out.println("Standard : "+ obj1.std);
		System.out.println("GRADE : "+ obj1.grade);
		Student obj2=new Student();
		System.out.println(text);
		obj2.name="Vinayak K ";
		obj2.age=12;
		obj2.height=4.2;
		obj2.std="Seventh";
		obj2.grade=65;
		obj2.add();
		
		
		}

}
