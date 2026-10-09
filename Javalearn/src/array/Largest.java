package array;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number : ");
		int size=sc.nextInt();
		int store=0;		
		int largest=0;
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++) {
			  if (arr[i] > largest) {
			        largest = arr[i];
			    }
			}

			System.out.println("Largest = " + largest);

	}

}
