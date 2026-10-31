package oopsencapsulation;

import java.util.Scanner;

public class User {

	private String name;
	private String password;
	private long phono;

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the old password to update new : ");
		String password1=sc.nextLine();
		if(password1.equals(this.password)) {
			this.password=password1;	
			System.out.println("Updated");
		}
		else {
			System.out.println("Invalid Password ");
		}
	}

	public long getphono() {
		return phono;
	}

	public void setphono(long phono) {
		this.phono = phono;
	}

	public User(String name, String password, long phono) {
		this.name = name;
		this.password = password;
		this.phono = phono;

	}

	public static void main(String[] args) {
		User obj = new User("Alan", "20002",66666666);
		obj.setpassword("");
		


		
	

	}

}
