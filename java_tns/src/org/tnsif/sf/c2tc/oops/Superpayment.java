package org.tnsif.sf.c2tc.oops;
class Payment1{
	void process() {
		System.out.println("processing payment using standard gateway");
	}
}
class Gpay extends Payment1{
	void process() {
		System.out.println("processing payment using gpay");
	}
	void completeTransaction() {
		super.process();
		process();
	}
}
public class Superpayment {

	public static void main(String[] args) {
		Gpay g = new Gpay();
		g.completeTransaction();

	}

}
