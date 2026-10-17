package oopspractice;

public class Personobj {


	public static void main(String[] args) {
		Person arr[]=new Person[3];
		Person per=new Person();
		arr[0]=per;
		per.name="Arjun";
		per.age=26;
		per.height=4.5;
		per.print();
		
		Person per1=new Person();
		arr[1]=per1;
		per1.initalize("Amal",22,4.5);
		per1.print();
		 
		Person per2=new Person("Aby",24,5.5);
		arr[2]=per2;
		per2.print();
		
		

	}

}
