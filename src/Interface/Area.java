package Interface;

public class Area implements AreaOfRec,AreaOfSquare{

	@Override
	public void areaSq() {
		// TODO Auto-generated method stub
		int side=40;
		System.out.println("Area of sq:"+side*side);
		
	}

	@Override
	public void areaRec() {
		// TODO Auto-generated method stub
		int b=30;
		int w=10;
		int Ar=b*w;
		System.out.println("Area of rectangle:"+Ar);
	}
	public static void main(String args[]) {
		Area a=new Area();
		a.areaRec();
		a.areaSq();
	}

}
