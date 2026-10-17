package oopspractice;

public class Productobj {

	public static void main(String[] args) {
		
		Product prod1 = new Product();
		prod1.name = "Laptop";
		prod1.price = 45000.23;
		prod1.quantity = 1;
		prod1.print();
		prod1.category();

		Product prod2 = new Product();
		prod2.name = "Headphone";
		prod2.price = 6300.12;
		prod2.quantity = 1;
		prod2.print();
		prod2.category();

		Product prod3 = new Product();
		prod3.display("Smartphone", 43453.5, 2);
		prod3.print();
		prod3.category();

		Product prod4 = new Product();
		prod4.display("Chair", 5134.45, 4);
		prod4.print();
		prod4.category1();

		Product prod5 = new Product();
		prod5.display("Table", 55134.45, 2);
		prod5.print();
		prod5.category1();

		Product prod6 =new Product("Sofa", 23000.23, 1);
		prod6.print();
		prod6.category1();

	}

}
