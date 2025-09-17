package org.tnsif.c2ctc.multithreading;


class Eclipse extends Thread{
	public void run() {
		System.out.println("Eclipse id" + " "+ Thread.currentThread().getId());
	}
}
class OneNote extends Thread{
	public void run() {
		System.out.println("OneNote id" + " "+ Thread.currentThread().getId());
	}
}
class Chrome extends Thread{
	public void run() {
		System.out.println("Chrome id" + " "+ Thread.currentThread().getId());
	}
}
public class ExtendingThreadDemo {

	public static void main(String[] args) {
		Eclipse o = new Eclipse();
		o.start();
		OneNote e = new OneNote();
		e.start();
		Chrome c = new Chrome();
		c.start();
		System.out.println("main id" + " "+ Thread.currentThread().getId());
	}

}
