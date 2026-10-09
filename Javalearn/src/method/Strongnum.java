package method;

import java.util.Scanner;

public class Strongnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Check wheather the number is strong or Not : ");
		int num = sc.nextInt();
		int load=num;
		int result=0;
		while(num!=0) {
			int store=num%10;
		    result=result+sum(store);
            
		num=num/10;
		}
		if(result==load) {
			System.out.println("Strong Number");
		}else {
			System.out.println("Not");
		}
	}

	public static int sum(int num) {
		int factorial = 1;
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
       return factorial;

	}

}
