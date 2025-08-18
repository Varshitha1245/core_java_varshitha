package org.tnsif.c2ctc.keywords;

class Product{
	double price;
	Product(double price){
		this.price = price;
	}

double calculateDiscount() {
	return this .price *0.10;
}
double calculateFinalPrice(){
	return this.price-this.calculateDiscount();
}
}

public class ThisKeyword {

	public static void main(String[] args) {
		Product pd = new Product(400);
		System.out.println("Final price "+pd.calculateFinalPrice());

	}

}
