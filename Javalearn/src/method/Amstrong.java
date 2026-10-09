package method;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the num : ");
		int num=sc.nextInt();
		int temp=num;
		int result=0;
		while(num!=0) {
			int store=num%10;
		result=result+power(store,noofdigit(temp));
		num=num/10;
		}
		if(result==temp) {
			System.out.println("Amstrong");
		}else {
			System.out.println("Not");
		}
		}
	
    public static int noofdigit(int num) {
    	int count=0;
     	while(num!=0) {
    		num=num/10;
    		   count++;
    		 }
     	return count;
   }
    
    public static int power(int c ,int b) {
    	int power=1;
    	for(int i=1;i<=b;i++) {
    		power=power*c;
    	}
    	return power;
    }
  
}
