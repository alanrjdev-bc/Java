package method;

public class Employeobj {

	public static void main(String[] args) {
		Employe obj = new Employe();
		obj.name = "Alan Rj ";
		obj.id = 201001;
		obj.salary = 22000;
		System.out.println(obj.name);
		obj.job();
		System.out.println(obj.id);
		System.out.println(obj.salary);

		Employe obj2 = new Employe();
		obj2.name = "Rahul S ";
		obj2.id = 201002;
		obj2.salary = 23000;
		obj2.display();
		obj2.job1();
		
		Employe obj4 = new Employe();
		obj4.initalize("Aslam E ", 201004, 20000);
		obj4.display();
		obj4.job();

		Employe obj5 = new Employe();
		obj5.initalize("Alammen S ", 201005, 30000);
		obj5.display();
		obj.job1();

	}

}
