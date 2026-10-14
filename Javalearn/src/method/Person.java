package method;

public class Person {
	String name;
	int age;
	String place;
	
	public void run() {
		System.out.println("Can run");
	}
	public void speak() {
		System.out.println("Can speak");
	}
	  public  void display() {
		 System.out.println(name); 
		 System.out.println(age);
		 System.out.println(place);
		 }

	public static void main(String[] args) {
		Person obj=new Person();
		Person obj1=new Person();
		Person obj2=new Person();
		Person obj3=new Person();
		Person obj4=new Person();
		//initialize using reference variable.
		obj.name="Alan";
		obj.age=23;
        obj.place="Trivandrum";		
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.place);
        obj1.name="Arjith";
		obj1.age=22;
        obj1.place="Attingal";		       
        obj1.display();
        obj.run();
        obj.speak();
       
        
        

	}

}
