package method;

import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name = sc.next();
		System.out.println("Enetr the name : ");
		String name1 = sc.next();
		System.out.println("Enetr the name : ");
		String name2 = sc.next();
		String[] store = array(name, name1, name2);
		for (String a:store) {
			System.out.println(a);
		}
	}

	public static String[] array(String a, String b, String c) {
		String array[] = new String[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		return array;

	}

}
