package MultiThreading;
class A1 extends Thread{
	
	public void run() {
		String n=Thread.currentThread().getName();
		for(int i=0;i<3;i++) {
			System.out.println(n);
		}
				
	}
}
public class ThreadScheduler {
    public static void main(String[] args) {
		 A1 t1=new A1();
		 A1 t2=new A1();
		 A1 t3=new A1();
		 
		 t1.setName("Thread 1");
		 t2.setName("Thread 2");
		 t3.setName("Thread 3");
		 
		 t1.start();
		 t2.start();
		 t3.start();
		 
		 String n=Thread.currentThread().getName();
			for(int i=0;i<3;i++) {
				System.out.println(n);
			}
			
	}
}
