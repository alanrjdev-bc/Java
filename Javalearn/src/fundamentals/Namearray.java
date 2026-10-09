package fundamentals;
import java.util.Scanner;
public class Namearray {

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	     
	    	System.out.println("Enetr the size : ");
	    	int size=sc.nextInt();
	      	String arr[]=new String[size];
	      	
	      	for(int i=0;i<size;i++) {
	      		arr[i]=sc.next();
	      		}
	      	for(int i=0;i<arr.length;i++) {
	      		System.out.println(arr[i]);
	      	}
	  	    }
	}


