package fundamentals;

import java.util.Scanner;

public class Copyarry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the number  : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int array[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			  sc.nextInt();
		}
		for (int q : arr) {
			System.out.println(q);
		}

		for (int r = 0; r < array.length; r++) {

			array[r] = arr[r];
		}

		for (int v : array) {
			System.out.println(v);
		}

	}

}
