package fundamentals;

import java.util.Scanner;

public class Xample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num=sc.nextInt();
		System.out.println("Enter the name : ");
		String name=sc.next();
		merge(num,name);
		
}
	public static void merge(int num ,String name) {
		for(int i=1;i<=num;i++) {
			System.out.println(i);
			System.out.println(name);
		}
		
		
			}

}
