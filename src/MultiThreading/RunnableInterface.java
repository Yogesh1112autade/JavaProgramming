package MultiThreading;
class A implements Runnable{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("My child Thread");
		}
	}
}
public class RunnableInterface {
  public static void main(String[] args) {
	
	  A t=new A();
	 Thread t1=new Thread(t);
	  t1.start();
	  for(int i=0;i<=5;i++) {
			System.out.println("Main Thread");
		}

}
}
