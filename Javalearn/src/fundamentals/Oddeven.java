package fundamentals;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the num : ");
	    int num=sc.nextInt();
	    int store=between(num);
	    int hund=after(store);
	    System.out.println(hund);
	    
	}
	public static int between (int num) {
		if(num%2!=0) {
			return num;
		}else {
			System.out.println("Even");
			return 0;
		}
	}
	public static int after(int found) {
		int into=found*100;
		return into;
		
	}
	

}
