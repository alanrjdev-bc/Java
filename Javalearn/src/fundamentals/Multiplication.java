package fundamentals;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Check the multiplication table of  : ");
		int num = sc.nextInt();
		multi(num);
	}

	public static void multi(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + num + " = " + i * num);
		}
	}

}
