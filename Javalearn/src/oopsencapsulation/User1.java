package oopsencapsulation;

public class User1 {

	public static void main(String[] args) {
		User obj1 = new User("Rahul", "34001", 345678934);
		System.out.println(obj1.getname());
		obj1.setname("midhun");
		System.out.println(obj1.getname());
		System.out.println(obj1.getpassword());
		System.out.println(obj1.getphono());

	}

}
