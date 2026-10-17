package oopspractice;

public class Iteamobj {

	public static void main(String[] args) {
		System.out.println("GROCERY DETAILS");
		Iteam arr[]=new Iteam[6];
		
		Iteam itm1=new  Iteam();
		arr[0]=itm1;
		itm1.name="Suagr";
		itm1.price=50;
		itm1.quantity=3;
		
		Iteam itm2=new  Iteam();
		arr[1]=itm2;
		itm2.initalize("Oil", 120, 2);
		
		Iteam itm3=new Iteam("Salt",30,5);
		arr[2]=itm3;
		
		Iteam itm4=new Iteam("Tea",1);
		arr[3]=itm4;
		
		Iteam itm5=new Iteam("Milk",2);
		arr[4]=itm5;
		
		Iteam itm6=new Iteam("Coffee",200);
		arr[5]=itm6;
		
		for( Iteam data:arr) {
			data.print();
		}
		
		
		
		
		
		
	}

}
