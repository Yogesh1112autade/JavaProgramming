package Overloadiing;

public class AreaOfShape {
	public void area() {
		System.out.println("printed area :");
	}
	
	public void area(int r) {
		double a=3.4*r*r;
		System.out.println("Area of circle:"+a);
	}
	
	public void area(int b,int w) {
		int ar=b*w;
		System.out.println("area of rectangle:"+ar);
		
		}
	public void area(double b,double w) {
		double Tarea=0.5*b*w;
		System.out.println("Area of triangle:"+Tarea);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfShape a=new AreaOfShape();
		a.area();
		a.area(5);
		a.area(2.3, 5.6);
		a.area(10, 20);

	}

}
