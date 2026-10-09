package fundamentals;

import java.util.Scanner;

public class Mehodtwo {

	public static void main(String[] args) {
		Add();

	}
	public static void Add() {
		Scanner sc=new Scanner (System.in);
			System.out.println("Enter the num1 :");
			int num1=sc.nextInt();
			System.out.println("Enter the num2 :");
			int num2=sc.nextInt();
			System.out.println(num1+num2);
		}
	}


