package Constructor;

public class Const {
	int c=20;
	//constructor
	public Const() {
		System.out.println("This is constructor");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Const c=new Const();
       System.out.println("Value of x:"+c.c);
	}

}
