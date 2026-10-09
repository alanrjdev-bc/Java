package fundamentals;



public class Greatreturn {

	public static void main(String[] args) {
		int large=lar(1,2,3);
	    System.out.println(large);

	}
	public static int lar(int a,int b, int c) {
		
		if(a>b && a>c) {
			return a;
			}
		else if (a<b && b>c) {
			return c;
		}
		else if(a<c && c>b)
		{
			return c;
		}
	
	return 0;
	}

}
