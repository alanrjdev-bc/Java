package fundamentals;

import java.util.Scanner;

public class Sumarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the number : ");
		int size=sc.nextInt();
		int  arr[]=new int[size];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for( int a:arr) {
			sum=sum+a;
		}
		System.out.println(sum);

	}

}
