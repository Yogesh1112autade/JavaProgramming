package Abstraction;

//here we cannot extends more than one class
public class Bike extends Vehicle{

	int price=200000;
	@Override
	void price() {
		// TODO Auto-generated method stub
		System.out.println("Vehicel price is:"+price);
		
	}
	
	public static void main(String args[]) {
		Bike b=new Bike();
		b.Vehicle_color();
		b.price();
	}

}
