package oopspractice;

public class Tearcherobj {

	public static void main(String[] args) {
		Teacher tech=new Teacher();
		tech.name="Smrthi SB";
		tech.id=201001;
		tech.subject="English";
		tech.classno=10;
		tech.print();
		tech.attendence(80);
		
		Teacher tech1=new Teacher();
		tech1.initalize("Aleena RJ", 201002,"Maths",8);
		tech1.print();
		tech.attendence(90);
		
		
		Teacher tech2=new Teacher("Admira",201003,"Biology",3);
		tech2.print();
		tech.attendence(70);
		
		
		

	}

}
