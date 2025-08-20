package java_tns.corejava;

class User1{
	String name;
	int age;
	
	User1(){
		name="guest";
		age=23;
		System.out.println(name+" "+age);
	}
	User1(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("user created : "+ name + age);
	}
}
public class Demo_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User1 u = new User1();
		User1 u1 = new User1("varshi", 26);
	}

}
