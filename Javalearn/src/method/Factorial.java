package method;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the number : ");
		int number=sc.nextInt();
		int result=fact(number);
		System.out.println(result);
		

	}
public static int fact(int number) {
	int fact=1;
	for(int i=1;i<=number;i++) {
		fact=fact*i;
	}
	return fact;
		
}
}
