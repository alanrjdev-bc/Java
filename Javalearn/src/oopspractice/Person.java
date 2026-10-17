package oopspractice;

public class Person {
	String name;
	int age;
	double height;
	
	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
	}
	
	public void initalize(String name,int age,double height) {
		this.name=name;
		this.age=age;
		this.height=height;
	}
	public Person(String name,int age,double height) {
		this.name=name;
		this.age=age;
		this.height=height;
	}
	public Person() {
		
	}
	public static void main(String[] args) {
		

	}

}
