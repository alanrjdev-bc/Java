package fundamentals;

import java.util.Scanner;

public class Countnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number : ");
		int count=sc.nextInt();
        run(count);
	}
	public static void run(int count) {
		for(int i=count;i>=1;i--) {
			System.out.println(i);
		}
	}

}
