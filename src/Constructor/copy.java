package Constructor;

public class copy {
	int a;
	String str;
	public copy() {
		 a=10;
		 str="Yogesh";
		System.out.println(a +" "+str);
	}
	public copy(copy obj) {
		a=obj.a;
		str=obj.str;
		System.out.println(a +" "+str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copy c1=new copy();
		copy c2=new copy(c1);

	}

}
