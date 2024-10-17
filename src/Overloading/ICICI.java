package Overloading;

public class ICICI {
	int RateOfInterest() {
		return 10;
	}
	public static void main(String args[]) {
		SBI s=new SBI();
		ICICI i=new ICICI();
		Bank b=new Bank();
		
		System.out.println("SBI rate of interrest:"+s.RateOfInterest());
		System.out.println("ICICI rate of interrest:"+i.RateOfInterest());
		System.out.println("Bank rate of interrest:"+b.RateOfInterest());
	}

}
