package oopspractice;

public class Truk extends Bike{
	String runtype;

	public Truk(String color,String name, String type, double price,String runtype) {
		super(color,name,type,price);
		this.runtype=runtype;
		
	}
	
	
	public static void main(String[] args) {
		Truk tr=new Truk("Blue","Layland","8 wheeler",230000,"Onroad");
		tr.print();
		Bike b1 = (Bike) tr;
		System.out.println(tr.color);
		System.out.println(tr.runtype);
		
		

	}

}
