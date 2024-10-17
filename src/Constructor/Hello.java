package Constructor;

public class Hello {
	// parameterized constructor
	public Hello(int x,int y) {
		System.out.println("Value of x is:"+x);
		System.out.println("Value of Y is :"+y);
		
	}
	
	public void add(int a,int b) {
		System.out.println("sum="+(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello h=new Hello(2,5);//calling constructor with parameter
		
		h.add(10,50);

	}

}
