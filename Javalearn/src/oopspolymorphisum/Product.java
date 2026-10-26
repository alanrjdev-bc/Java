package oopspolymorphisum;

public class Product {
	String name;
	double price;
	int quantity;

	public Product(String name, double price, int quantity) {
    this.name=name;
    this.price=price;
    this.quantity=quantity;
	}

	public void category() {
		System.out.println("Electronic iteam");
	}

	public static void main(String[] args) {
		Product obj1=new Furniture("Sofa",23400,2,"brown");
		obj1.category();

	}

}
