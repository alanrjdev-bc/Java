package oopspractice;

public class Nonveg extends Vegmeal{
 
	String egg;
	String complimentry;
	
	public Nonveg(String rice, int quantity, double price, String nomeat,String egg,String complimentry) {
		super(rice,quantity,price,nomeat);
		this.egg=egg;
		this.complimentry=complimentry;
		
	}
	public static void main(String[] args) {
		Vegmeal nv=new Nonveg("Has rice",2,200,"has meat","has egg","has complimentry");
		nv.print();
		Nonveg vn=(Nonveg)nv;
		System.out.println(vn.complimentry);
		System.out.println(vn.egg);
		System.out.println(vn.price);
		System.out.println(vn.rice);
		System.out.println(vn.nomeat);
		
		
		
		

	}

}
