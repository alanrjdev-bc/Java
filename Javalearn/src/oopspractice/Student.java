package oopspractice;

public class Student {
	String name;
	int age;
	int std;
	
	public void print() {
		System.out.println("Name :  "+ name);
		System.out.println("Age : " + age);
		System.out.println("Standard : "+ std);
	}
	public void attendence(int attendence) {
		System.out.println("Attendence  : " + attendence + " %");
	}
	
	public Student(String name,int age,int std) {
		this.name=name;
		this.age=age;
		this.std=std;
		}
	

	public static void main(String[] args) {
		
	}
	

}
