package fundamentals;

import java.util.Scanner;

public class Menudriven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		do {
			System.out.println("Enetr a number : ");
			num=sc.nextInt();
			
		}while(num>=0);

	}

}
