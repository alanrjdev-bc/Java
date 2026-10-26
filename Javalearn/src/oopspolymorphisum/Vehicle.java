package oopspolymorphisum;



public class Vehicle {
     
	
	public void Calculatemillage( double distance , int petrolliter) {
		System.out.println(distance/petrolliter);
		
	}
	
	public void Calculatemillage( int distance , int petrolliter,int passenger) {
		System.out.println(distance + petrolliter + passenger);
	}



	public static void main(String[] args) {
		Vehicle obj1=new Vehicle();
		obj1.Calculatemillage(23.4, 5);
		obj1.Calculatemillage(12, 6, 12);
		
		
     
	}

}
