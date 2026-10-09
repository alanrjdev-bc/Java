package fundamentals;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num=sc.nextInt();
		int largest=0;
		for(int i=1;i<=num;i++) {
		   if(largest<i) {
			   largest=i;
		   }
		}
		System.out.println(largest);

	}

}
