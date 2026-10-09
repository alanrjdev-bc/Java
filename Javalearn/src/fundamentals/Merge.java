package fundamentals;

import java.util.Scanner;

public class Merge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of 1starray : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enetr the size of 2ndarray : ");
		int size1 = sc.nextInt();
		int arrtwo[] = new int[size1];
		for (int j = 0; j < arrtwo.length; j++) {
			arrtwo[j] = sc.nextInt();
		}
		
		
		int sizethree = size + size1;
		int arrthree[] = new int[sizethree];
		for (int t = 0; t < arr.length; t++) {
			
				arrthree[t]=arr[t];
			}
		int x=0;
		for (int t = arr.length; t < arrthree.length; t++) {
			
		while(x<arrtwo.length) {
			arrthree[t]=arrtwo[x];
			x++;
			break;
				
			}
		}
		for(int e:arrthree) {
			System.out.println(e);
		}
		}
		

	}


