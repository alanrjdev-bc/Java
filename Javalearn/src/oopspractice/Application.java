package oopspractice;

public class Application {
	String name;
	int age;
	String place;
	String emailid;
	
	
	public void print() {
		System.out.println("Name : "+ name);
		System.out.println("Age : "+ age);
		System.out.println("Place : "+ place);
		System.out.println("Email : "+ emailid);
		
	}
	
	public Application(String name,int age,String place,String emailid) {
		this.name=name;
		this(place,age,emailid);
		
		
	}
	public Application(String place,int age,String emailid) {
		this.age=age;
		this.place=place;
		this.emailid=emailid;
		
		
	}
	public Application(int age,String place) {
		this.age=age;
		this.place=place;
		
	}
	public Application(String emailid,String name,int age) {
		this.emailid=emailid;
		this.name=name;
		this.age=age;
		
		
	}
	public Application(String name) {
		this.name=name;
	}
    public Application(int age) {
    	this.age=age;
    }
   
    
   

}
