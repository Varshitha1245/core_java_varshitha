package org.tnsif.c2tc.interface_demo;



class EmailNotification implements NotificationService{

	@Override
	public void notifyUser(String Message) {
		System.out.println("sending email :"+ Message);
		
	}
	
}
class SMSNotification implements  NotificationService{

	@Override
	public void notifyUser(String Message) {
		System.out.println("sending message :"+Message);
		
	}
	
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		NotificationService n = new EmailNotification();
		NotificationService s = new SMSNotification();
		n.notifyUser("hii");
		s.notifyUser("good evening");
	}

}
