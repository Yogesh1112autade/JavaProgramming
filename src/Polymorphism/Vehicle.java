package Polymorphism;

public class Vehicle {
	public void properties() {
		System.out.println("Vehicle class is printed");
	}
	public static void main(String arggs[]) {
		Bicycle b=new Bicycle();
		Car c=new Car();
		Vehicle v=new Vehicle();
		
		b.properties();
		c.properties();
		v.properties();
	}

}
