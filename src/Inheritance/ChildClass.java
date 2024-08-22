package Inheritance;

public class ChildClass extends FatherClass{
	
	public void ChildMethod() {
		System.out.println("this is Child class");
	}
	
	public static void main(String args[]) {
		
		ChildClass obj=new ChildClass();
		obj.GrandFatherMethod();
		obj.FatherMethod();
		obj.ChildMethod();
		
		//Access parent class property
		System.out.println(obj.name);
	}

}
 