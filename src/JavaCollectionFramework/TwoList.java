package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class TwoList {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		List<Integer>  list2=new ArrayList<>();
		list1.add(10);
		list1.add(11);
		list1.add(12);
		list1.add(14);
		
		list2.add(11);
		list2.add(16);
		list2.add(17);
		list2.add(18);
		
		//list1.addAll(list2);      // add two list
		//list1.retainAll(list2);     // show common value between two list
		//System.out.println(list1);
		
		Object a[]=list1.toArray();   // convert to array
		for(Object o:a) {
			System.out.println(o);
		}
	

	}

}
