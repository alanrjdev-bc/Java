package oopspractice;

public  abstract class Productone {
	String name;
	double price;
	int quantity;
	
	
	static {
		System.out.println("  Product_Details   ");
	}
	public void print () {
		System.out.println("Name :" + name);
		System.out.println("Price : "+ price);
		System.out.println("Quantity : " +quantity);
	}

	public Productone(String name, double price, int quantity) {
		this.name = name;
		this(price, quantity);
	}

	public Productone(double price, int quantity) {
		this.price = price;
		this.quantity = quantity;

	}

	public Productone(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;

	}

	public Productone(int quantity, String name) {
		this.name = name;
		this.quantity = quantity;

	}

	public Productone(double price) {
		this.price = price;

	}

	public Productone(int quantity) {
		this.quantity = quantity;
	}

	public Productone(String name) {
		this.name = name;
	}

	public void Calculatediscount() {
		System.out.println(price * quantity );
	}

	public void Calculatediscount(int discount, int gst) {
		System.out.println(price * quantity - discount + gst);
	}
	
	public abstract void use();

	public static void main(String[] args) {
		Productone obj1=new Electronicsone("Headphone",6400.3,2,"Black");
		if(obj1 instanceof Electronicsone) {
			Electronicsone E1=(Electronicsone)obj1;
		E1.Calculatediscount();
		E1.Calculatediscount(100, 20);
		System.out.println("Color : "+E1.color);	
		E1.use();
		}
		obj1.print();
		
	
		
		Productone obj2=new Phone("Vivo",23500.45,1,"Bule");
		if(obj2 instanceof Phone) {
			Phone P1=(Phone)obj2;
	      P1.Calculatediscount();
	      P1.Calculatediscount(200, 50);
	      P1.use();
	  	System.out.println("Color : "+P1.color);	
			
		}
		obj2.print();
		
		
	
		

	}

}
