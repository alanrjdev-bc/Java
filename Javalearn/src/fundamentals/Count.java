package fundamentals;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		int count=0;
		do {
			System.out.println("Enetr the num : ");
			num=sc.nextInt();
			if(num>0) {
				count++;
			}
		}while(num>=0);
		
    System.out.println("There are " + count + " Positive numbers");
		
	}

}
