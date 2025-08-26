package org.tnsif.c2ctc.keywords;


class UPI{
	final int Max_Daily_limit=100000;
	
	void showLimit() {
		System.out.println("daily transfer limit:  "+Max_Daily_limit);
	}
}
public class finalvariabledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UPI obj = new UPI();
		obj.showLimit();
		
			
	}

}
