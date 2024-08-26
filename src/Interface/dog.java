package Interface;

public class dog implements Animal,Human{

	@Override
	public void behaviour() {
		// TODO Auto-generated method stub
		System.out.println("Human interface method print ");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("dog  likes to bark");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("dog is sleeping");
		
	}
	public static void main(String args[]) {
		dog d=new dog();
		d.behaviour();
		d.sound();
		d.sleep();
	}

}
