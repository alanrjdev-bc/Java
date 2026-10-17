package oopspractice;

public class Studentobj {

	public static void main(String[] args) {
		Student  arr[]= new Student[3];
		Student stud=new Student ("Alan",6,7);
		Student stud1=new Student ("Amal",8,9);
		Student stud2=new Student ("Arjun",15,10);
		arr[0]=stud;
		arr[1]=stud1;
		arr[2]=stud2;
		for(Student data : arr) {
			data.print();
		}
		
		
		
		
		
		
		
		
		

	}

}
