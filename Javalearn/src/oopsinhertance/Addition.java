package oopsinhertance;
//MethodOverloading.

public class Addition {
	int defaultbill=500;
	double itmprice;
	
	
	public void Calculatebill() {
		System.out.println(defaultbill);
	}
	
	public void Calculatebill(double itmprice) {
		System.out.println(itmprice);
	}
	public void Calculatebill(double itmprice,int defaultprice) {
		System.out.println(itmprice+defaultprice);
	}
	
	public static void main(String[] args) {
		Addition obj1=new Addition();
		obj1.Calculatebill();
		obj1.Calculatebill(200);
		obj1.Calculatebill(200, 500);
	

	}

}
