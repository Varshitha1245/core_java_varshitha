package org.tnsif.c2ctc.scanner;


class User2{
	String username;
	static String appName="Instaclone";
	public static User2 u2;
	
	User2(String username){
		this.username=username;
	}
	void showDetails() {
		System.out.println("User :"+username + "App : "+appName);
		
	}
}
public class StaticVariableDemo {

	public static void main(String[] args) {
		User2 u1=new User2("hema");
		User2 u2 = null;
		User2.u2=new User2("chandana");
		u1.showDetails();
		u2.showDetails();

	}

}
