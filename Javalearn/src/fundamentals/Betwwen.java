package fundamentals;

import java.util.Scanner;

public class Betwwen {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Size of the Array : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int smallest=0;
		 int largest=0;
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
		    if(arr[i] > largest) {
		    	  largest=arr[i];
		    }
		    }
		System.out.println(largest);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println(smallest);
		
		
		
	}

}
