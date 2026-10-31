package oopsencapsulation;

public class Bankaccountobj {

	public static void main(String[] args) {
		Bankaccount account=new Bankaccount(122334455,"12223",23500,"QWKA123AC");
		System.out.println(account.getaccountno());
		account.setpassword("1222");
		account.getbalance();
		account.getifcscode();
		account.CheckBalance();
		account.withdraw(500.1);
		account.deposit(400.3);

	}

}
