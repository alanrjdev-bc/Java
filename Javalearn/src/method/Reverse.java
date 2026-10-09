package method;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num=sc.nextInt();
	int duplicate=num;
	int sum=reverse(num);
	if(sum==duplicate) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("Not");
	}
	

	}
	public static int reverse(int r) {
		int rev=0;
		while(r!=0) {
			int store=r%10;
			
			rev=rev*10+store;
			r=r/10;
		}
		
		return rev;

			
	}

}
