package oopspractice;

public class Mobile {
	String brand;
	String model;
	double price;
	int storage;
	int batterycapacity;
	static String text="MOBILE DETAILS";
	public void print() {
		System.out.println(text);
		System.out.println("Brand Name : "+ brand);
		System.out.println("Model : "+ model);
		System.out.println("Price : "+ price);
		System.out.println("Storgae : "+ storage);
		System.out.println("Capacity : " + batterycapacity);
		
	}
	public void initalize(String brand,String model,double price,int storage,int batterycapacity) {
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.storage=storage;
		this.batterycapacity=batterycapacity;
	}
	
	public Mobile(String brand, String model, double price,int storage, int batterycapacity) {
        this.brand = brand;
        this.model = model;
        this(storage,price,batterycapacity);
    }
	  
    public Mobile(int storage, double price, int batterycapacity) {
        this.storage = storage;
        this.price = price;
        this.batterycapacity = batterycapacity;
    }
    public Mobile(String brand, String model) {
        this.brand=brand;
        this.model=model;
    }

    
    public Mobile(String model, double price) {
        this.model = model;
        this.price = price;
    }

	   public Mobile(String brand) {
	        this.brand = brand;
	   }
	
    public Mobile() {
	    }

}
