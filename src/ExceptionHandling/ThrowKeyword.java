package ExceptionHandling;

public class ThrowKeyword {
	
	public void checkage(int age) {
		if(age<18) {
			throw new ArithmeticException("Access denied-you must have age to be 18 years old");
		}
		else {
			System.out.println("Access granted");
		}
	}
	public static void main(String args[]) {
		ThrowKeyword t=new ThrowKeyword();
		t.checkage(12);
	}

}
