package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListInterFace {
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		List<Integer>  list2=new ArrayList<>();
		list1.add(10);
		list1.add(11);
		list1.add(12);
		list1.add(14);
		
		
		System.out.println(list1.contains(12));
		System.out.println(list1.remove(Integer.valueOf(14)));//remove specific value
		System.out.println(list1.remove(2));// remove index based value
		System.out.println(list1);
	}

}
