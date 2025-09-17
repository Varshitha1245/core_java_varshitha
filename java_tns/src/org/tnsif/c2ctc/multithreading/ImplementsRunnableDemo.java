package org.tnsif.c2ctc.multithreading;

class Eclipse1 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Eclipse id" + " "+ Thread.currentThread().getId());
		}
		
	}
	
}
public class ImplementsRunnableDemo {

	public static void main(String[] args) {
		Eclipse1 o = new Eclipse1();
		Thread o1 = new Thread(o);
		o1.start();
		System.out.println("main id" + " "+ Thread.currentThread().getId());// TODO Auto-generated method stub

	}

}
