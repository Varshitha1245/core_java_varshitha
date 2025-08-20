package java_tns.corejava;

class Student{
	String name;
	int age;
	
	Student(){
		System.out.println("default constructor");
	}
	Student(String name){
		this.name=name;
		System.out.println("Name : "+name);
	}
	Student(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("Name : "+name+"Age : "+age);
	}
}
public class Constructor_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Student s1 = new Student("alice");
		Student s2 = new Student("bob", 23);
	}

}
