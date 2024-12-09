package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class SubList {
	public static void main(String[] args) {
		List<String>  list=new ArrayList<>();
		
		list.add("Yogesh");
		list.add("Asha");
		list.add("Manisha");
		list.add("Rahul");
		
		List<String>  li=list.subList(1, 3);
		
		System.out.println(li);
		
	}

}
