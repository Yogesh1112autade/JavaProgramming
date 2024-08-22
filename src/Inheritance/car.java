package Inheritance;

public class car extends Vehicle {
	int price=20;
	public void carMethod() {
		System.out.println("Price of car is 20000");
		
	}
	public static void main(String args[]) {
		car c=new car();
		c.carMethod();
		c.SuperVehicleMethod();
		c.VehicleMethod();
		System.out.println("price="+c.price);
	}

}
