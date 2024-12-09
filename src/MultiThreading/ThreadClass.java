package MultiThreading;
class Hello extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Yogesh");
		}
	}
}
public class ThreadClass {
    public static void main(String[] args) {
		Hello h=new Hello();
		h.start();
		for(int i=0;i<=5;i++) {
			System.out.println("Vikas");
		}
	}
}
