package fundamentals;

public class Taskone {

	public static void main(String[] args) {
		int[] arr = new int[6];
		arr[0] = 1;
		arr[1] = 8;
		arr[2] = 2;
		arr[3] = 5;
		arr[4] = 3;
		arr[5] = 4;
		int largest=0;
		for (int i = 0; i < arr.length; i++) {
            int store=arr[i];
            if(store>largest) {
            	largest=store;
            }
            
            }
		System.out.println(largest);

	}

}
