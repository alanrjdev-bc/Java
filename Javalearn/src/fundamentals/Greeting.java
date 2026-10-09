package fundamentals;

import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Hour : ");
		int hour = sc.nextInt();
		hour(hour);

	}

	public static void hour(int hour) {
		if (hour > 0 && hour <= 11) {
			System.out.println("Good Morning");
		} else if (hour >= 12 && hour <= 17) {
			System.out.println("Goodafternoon");
		} else if (hour >= 18 && hour <= 23) {
			System.out.println("Godevening");
		} else {
			System.out.println("default");
		}

	}
}
