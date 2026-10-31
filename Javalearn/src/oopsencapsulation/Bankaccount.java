package oopsencapsulation;

import java.util.Scanner;

public class Bankaccount {
	private long accountno;
	private String password;
	private double balance;
	private String ifsccode;

	public Bankaccount(long accountno, String password, double balance, String ifsccode) {
		this.accountno = accountno;
		this.password = password;
		this.balance = balance;
		this.ifsccode = ifsccode;

	}

	public long getaccountno() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your password to show the account no  : ");
		String password1 = sc.next();
		if (this.password.equals(password1)) {
			return this.accountno;
		} else {
			System.out.println("invalid password");
		}
		return 0;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		Scanner pc = new Scanner(System.in);
		System.out.println("Enter the accountno & oldpassword to update password");
		System.out.println("Enter the current password : ");
		String password2 = pc.next();
		System.out.println("Enter the accountno : ");
		long accountno1 = pc.nextLong();
		if (accountno1 == this.accountno && this.password.equals(password2)) {
			System.out.println("Updated");
			this.password = password2;
		} else {
			System.out.println("Invalid accountno/password");
		}

	}

	public double getbalance() {
		return balance;
	}

	public String getifcscode() {
		Scanner cod = new Scanner(System.in);
		System.out.println("Enter the accountno to see the ifsccode   : ");
		double accountno2 = cod.nextDouble();
		if (accountno2 == this.accountno) {
			System.out.println(ifsccode);

		} else {
			System.out.println("Invalid Accountno");
		}

		return ifsccode;
	}

	public void CheckBalance() {
		Scanner check = new Scanner(System.in);
		System.out.println("Enter the password to check balance  : ");
		String password3 = check.next();
		if (this.password.equals(password3)) {
			System.out.println("Balance : " + balance);
		}

	}

	public void withdraw(double withdraw) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password to withdraw: ");
		String password4 = sc.next();
		if (this.password.equals(password4) && withdraw < balance) {
			balance = balance - withdraw;
			System.out.println("Current Balance : " + balance);
		} else {
			System.out.println("Insufficent balance");
		}

	}

	public void deposit(double deposit) {
		Scanner de = new Scanner(System.in);
		System.out.println("Enter the password to  deposit : ");
		String password5 = de.next();
		if (this.password.equals(password5)) {
			System.out.println("Current balance : " + (balance + deposit));
		}
	}

}
