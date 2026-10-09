package fundamentals;

import java.util.Scanner;

public class Countfor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int countodd = 0;
		int evencount = 0;
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				countodd++;
			} else {
				evencount++;
			}
		}
		System.out.println("Even " + countodd);
		System.out.println("ODD " + evencount);

	}

}
