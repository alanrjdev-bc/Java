package oopsinhertance;

public class Product {
	String name;
	double price;
	int quantity;
	String category;
	
	
	public void print() {
		System.out.println(name);
		System.out.println(quantity);
		System.out.println(price);
	}
	public Product(String name,double price,int quantity) {
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		
	}
	
	public void category(String category) {
       this.category=category;
		
	}

	public static void main(String[] args) {
		Product arr[]=new Product[2]; 
		Product obj1=new Furiture("Table",12350,1,"Brown");
		obj1.category("Furniture");
		arr[0]=obj1;
		Product obj2=new Electronics("Pnone",223500.5,1,"Black","F19pro");
		obj1.category("Electronics");
		arr[1]=obj2;
		
		for(Product data : arr) {
			data.print();
		}
		
		

	}

}
