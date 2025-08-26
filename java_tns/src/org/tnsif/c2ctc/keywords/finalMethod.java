package org.tnsif.c2ctc.keywords;
//ecommerce discount calculation

class EcommercePlatform{
	void calculateDiscount() {
		System.out.println("base discount = 10%");
	}
}
class Amazon extends EcommercePlatform{
	void calculateDiscount() {
		System.out.println("extra discount =20% ");
	}
}
public class finalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon obj = new Amazon();
		obj.calculateDiscount();
	}
}
