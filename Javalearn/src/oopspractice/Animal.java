package oopspractice;

public class Animal {

	String family;
	int legs;
	String name;
	int speed;
	String tail;
	
	public void print() {
		System.out.println(family);
		System.out.println(legs);
		System.out.println(name);
		System.out.println(speed);
		System.out.println(tail);
	}
	
	public Animal(String family,int legs,String name,int speed,String tail) {
		this.family=family;
		this.legs=legs;
		this.name=name;  
		this.speed=speed;
		this.tail=tail;
		
	}
    public static void main(String[] args) {
	Animal sc=new Animal("Cat family",4,"lion",20,"Long tail");
	System.out.println(sc.toString());
}
}
 