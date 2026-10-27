package oopspractice;

public class Companyobj {

	public static void main(String[] args) {
		Company arr[] = new Company[5];
		Company obj1 = new Company();
		arr[0] = obj1;
		obj1.name = "TATA";
		obj1.location = "trivandrum";
		obj1.Employes = 22;
		obj1.Developers = 6;
		obj1.emailid = "tata@gmail.com";
 
		Company obj2 = new Company();
		obj2.initalize("Quest", "Panavilla,Trivandrum", 8, 3, "quest@gmail.com");
		arr[1] = obj2;

		Company obj3 = new Company("Marvellous", "Kazakuttom,trivandrum", 20, 12, "marvellous@gmail.com");
		arr[2] = obj3;

		Company obj4 = new Company("Demo1", "Kollam", "demo1@gmail.com");
		arr[3] = obj4;

		Company obj5 = new Company("Luminartechnologies", 14, 4);
		arr[4] = obj5;
		Company obj6 = new Company();
		
		for (Company data : arr) {
			data.print();
		}
	}

}
