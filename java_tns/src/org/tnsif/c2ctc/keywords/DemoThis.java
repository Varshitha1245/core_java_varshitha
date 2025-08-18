package org.tnsif.c2ctc.keywords;
class Hotel{
	String rooms;
	String food;
	Hotel(String rooms,String food){
		this.rooms=rooms;
		this.food=food;
	}
	void display() {
		System.out.println("rooms: "+this.rooms);
		System.out.println("food :"+ this.food);
	}
	
}

public class DemoThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel h = new Hotel("two rooms", "want food");
		h.display();
	}

}
