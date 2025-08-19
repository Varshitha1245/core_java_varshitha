package org.tnsif.c2tc.polymorphism;


class Payment{
	void makePayment()
	{
		System.out.println("processing payment using generic method");
	}
}
class UpiPayment extends Payment{
	void makePayment()
	{
		System.out.println("payment made using UPI");
	}
}
class CardPayment extends Payment{
	void makePayment() {
		System.out.println("payment made using card");
	}
}
class WalletPayment extends Payment{
	void makePayment() {
		System.out.println("payment made using digital wallet");
	}
}
public class MethodOveriddingDemo {

	public static void main(String[] args) {
		Payment p;
		p = new UpiPayment();
		p.makePayment();
		p = new CardPayment();
		p.makePayment();
		p=new WalletPayment();
		p.makePayment();
	}

}
