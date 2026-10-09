package method;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int duplicate=num;
		int result = palindrome(num);
		if(result==duplicate) {
			System.out.println("Palindrome");
			
		}else {
			System.out.println("Not");
		}
	

	}
	public static int palindrome(int num) {
		
		 int rev = 0;

		    while (num != 0) {
		        int numstore = num % 10;
		        rev = rev * 10 + numstore;
		        num = num / 10;
		    }
		return rev;
		
	}

}
