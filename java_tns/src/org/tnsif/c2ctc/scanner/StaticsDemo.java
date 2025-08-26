package org.tnsif.c2ctc.scanner;

class Game{
	static int maxlevel;
	static {
		System.out.println("intialized game settings");
		maxlevel=50;
	}
	void showLevelInfo() {
		System.out.println("game has "+maxlevel+"levels");
	}
}
public class StaticsDemo {

	public static void main(String[] args) {
		Game g1=new Game();
		g1.showLevelInfo();
	}

}
