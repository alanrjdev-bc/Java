package oopspractice;

public class Applicationformobj {

	public static void main(String[] args) {
		Application arr[]=new Application[3];
		
		Application user1=new Application("Alan",23,"trivandrum","alanrj2817@gmail.com");
		Application user2=new Application("trivandrum","rahul@gmail.com",22);
		Application user3=new Application(22,"kollam");
		
		arr[0]=user1;
		arr[1]=user2;
		arr[2]=user3;
		for(Application data : arr) {
			data.print();
		}

	}

}
