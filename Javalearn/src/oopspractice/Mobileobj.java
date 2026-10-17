package oopspractice;

public class Mobileobj {

	public static void main(String[] args) {
		Mobile arr[] = new Mobile[4];
		Mobile model1 = new Mobile();
		arr[0] = model1;
		model1.brand = "Nothing";
		model1.model = "3A";
		model1.price = 22000.23;
		model1.storage = 250;
		model1.batterycapacity = 4500;

		Mobile model2 = new Mobile();
		arr[1] = model2;
		model2.initalize("Samsung", "S20 ultra", 43500, 400, 5000);
	 
		Mobile model3 = new Mobile(34000,300,4000);
		arr[2]=model3;
		Mobile model4 = new Mobile("OPPO","F19Pro");
		arr[3]=model4;
		
		for(Mobile data:arr ) {
			data.print();
		}

	}

}
