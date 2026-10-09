package fundamentals;

import java.util.Scanner;

public class Sumsquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
	    System.out.println("Eneter the num1: ");
	    int a=sc.nextInt();
	    System.out.println("Enetr the num2:  ");
	    int b=sc.nextInt();
		int store=sum(a,b);
		int result=multi(store);
		System.out.println(result);
		
	}
	public static int sum(int a,int b) {
      int add=a+b;
       return  add;
      }
	
	public static int multi(int c) {
	int  product=c*c;
	return product;
	}

}
