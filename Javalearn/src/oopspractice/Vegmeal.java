package oopspractice;

public class Vegmeal extends Meal{
	String nomeat;
	
	public Vegmeal(String rice, int quantity, double price, String nomeat) {
		super(rice,quantity,price);
		this.nomeat=nomeat;
		
	}

	public static void main(String[] args) {
		Meal v1=new Vegmeal("Has rice",1,120.23,"No");
		v1.print();
		Vegmeal non1=(Vegmeal) v1;
		System.out.println(non1.rice);
		System.out.println(non1.quantity);  
		System.out.println(non1.price);
		System.out.println(non1.nomeat);
		
    
	}

}
