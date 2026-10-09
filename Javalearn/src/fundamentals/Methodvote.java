package fundamentals;

import java.util.Scanner;

public class Methodvote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		 
		boolean result=vote(age);
		if(result==true) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not Eligible");
		}
	}

	public static boolean vote(int age) {
		 if (age >= 18) {
				return true;
			} else {
				return false;
			}
	}

}
