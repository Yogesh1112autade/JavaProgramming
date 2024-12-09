package JavaCollectionFramework;

import java.util.ArrayList;

public class ArrayListMethods {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> str=new ArrayList<>();
		str.add("Yogesh");
		str.add(0, "Vikas");
		// str.addAll("Asha","Manisha");
		Boolean val=str.contains("Yogesh");
		System.out.println("Yogesh is present or not:"+val);
		
		System.out.println(str.get(0));
	}

}
