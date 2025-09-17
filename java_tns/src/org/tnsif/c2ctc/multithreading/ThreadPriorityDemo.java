package org.tnsif.c2ctc.multithreading;
class Eclipse2 extends Thread{
	public void run() {
		System.out.println("Eclipse id" + " "+ Thread.currentThread().getId());
	}
}
class OneNote2 extends Thread{
	public void run() {
		System.out.println("OneNote id" + " "+ Thread.currentThread().getId());
	}
}
class Chrome2 extends Thread{
	public void run() {
		System.out.println("Chrome id" + " "+ Thread.currentThread().getId());
	}
}
public class ThreadPriorityDemo {

	public static void main(String[] args) {
		Eclipse2 o = new Eclipse2();
		o.start();
		o.setPriority(Thread.MAX_PRIORITY);
		OneNote2 e = new OneNote2();
		e.start();
		e.setPriority(Thread.MIN_PRIORITY);
		Chrome2 c = new Chrome2();
		c.start();
		c.setPriority(Thread.NORM_PRIORITY);
		

	}

}
