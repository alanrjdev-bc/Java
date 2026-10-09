package method;

import java.util.Scanner;

public class Deliverycha {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the price : ");
		double price=sc.nextInt();
		System.out.println("Enetr the Quantity : ");
		double quantity=sc.nextInt();
		double store=add(price,quantity);
		int delvcharge=50;
		System.out.println(store+delvcharge);

	}
	public static double add(double price ,double quantity) {
		double sum=price*quantity;
		return sum;
		
		
		
	}

}
