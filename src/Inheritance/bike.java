package Inheritance;

public class bike extends Vehicle{
	
	public void bikeMethod() {
		System.out.println("Bike is always better in rainy season");
	}
	public static void main(String args[]) {
		bike b=new bike();
		b.bikeMethod();
		b.VehicleMethod();
		b.SuperVehicleMethod();
		
	}

}
