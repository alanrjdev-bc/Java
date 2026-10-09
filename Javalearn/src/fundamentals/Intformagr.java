package fundamentals;

import java.util.Scanner;

public class Intformagr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int num=sc.nextInt();
		System.out.println("Enter the num1");
		int num1=sc.nextInt();
		sum(num,num1);

	}
	public static void sum(int num ,int num1) {
	System.out.println(num+num1);
		
	}

}
