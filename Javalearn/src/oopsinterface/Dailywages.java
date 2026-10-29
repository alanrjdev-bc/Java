package oopsinterface;

public class Dailywages {
	
	public void processpayment(Payable Payable) {
		Payable.pay();
	}

	public static void main(String[] args) {
		Payable pay=new Contract(23456);
	    Payable pay1=new Employe(23454,3456);
	    pay.pay();
	    pay1.pay();

		
	}

}
