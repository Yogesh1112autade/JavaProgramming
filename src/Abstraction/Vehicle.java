package Abstraction;

public class Vehicle extends Customer{


	void transaction() {
		// TODO Auto-generated method stub
		int amount =2000;
		System.out.println("Customer amout="+amount);
		}

	
	void accinfo() {
		// TODO Auto-generated method stub
		int cusacc=124934;
		System.out.println("customer account ni is:"+cusacc);
		
	}

	public static void main(String args[]) {
		Vehicle v=new Vehicle();
		v.transaction();
		v.accinfo();
	}
}
