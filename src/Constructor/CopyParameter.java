package Constructor;

public class CopyParameter {
    int empid;
    String empname;
	public CopyParameter(int id,String name) {
		// TODO Auto-generated constructor stub
		empid=id;
		empname=name;
		System.out.println(empid+" "+empname);
	}
	
	public CopyParameter(CopyParameter c) {
		System.out.println(c.empid+" "+c.empname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyParameter c=new CopyParameter(143,"Yogesh");
		CopyParameter c1=new CopyParameter(c);
	}

}
