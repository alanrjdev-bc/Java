package fundamentals;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		int result=found(num);
		System.out.println(result);

	}
	public static int found(int num) {
		int store=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				store=i;
			}
		}
		return store;
		
	}

}
