package oopsinterface;

public class Mobile extends Electronics implements Product, Productprice {
	String name;
	double price;
	String color;
	double gst;

	public Mobile(String name, double price, String color, double gst) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.gst = gst;
	}

	@Override
	public void use() { 
		System.out.println("Scrool");

	}

	@Override
	public void price() {
		System.out.println( "Actual price : "+ price);
	}

	@Override
	public void Calculategst() {
		System.out.println( "Actual Price plus gst : " +( price + gst));
	}
	

	public static void main(String[] args) {
		Mobile obj = new Mobile("Realme",23500,"Bule",45);
		obj.use();
		obj.price();
		obj.Calculategst();

	}

}
